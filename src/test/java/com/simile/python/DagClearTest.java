package com.simile.python;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2021/07/01
 */
public class DagClearTest {

    @Test
    public void clear() throws IOException {
        String dirPath = "/Users/haizhi/Documents/workspace/work/plan-antlr/examples/dags/";
        File rootDir = new File(dirPath);
        for (File file : rootDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".py") && name.startsWith("flow_");
            }
        })) {
            System.out.println("正在处理文件:" + file.getName());
            List<String> lines = IOUtils.readLines(new FileInputStream(file), UTF_8);
            boolean ownerMatched = false;
            boolean scheduleIntervalMatched = false;
            for (String line : lines) {
                line = line.trim();
                line = line.endsWith(",") ? line.substring(0, line.length() - 1) : line;
                if (line.startsWith("\'owner")) {
                    ownerMatched = line.endsWith("\'kip\'") || line.endsWith("\'kgp\'");
                    continue;
                }
                if (line.startsWith("schedule_interval")) {
                    scheduleIntervalMatched = line.endsWith("None");
                    continue;
                }
            }
            if (ownerMatched && scheduleIntervalMatched) {
                System.out.println(">>>清理文件：" + file.getName());
            }
        }

    }

}
