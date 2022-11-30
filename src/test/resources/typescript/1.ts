import AppHeader from '@components/AppHeader/AppHeader'
import NewSider from './components/NewSider'
import { getLocalString, setLocal, removeLocal } from '@utils/storage'
import { getMiddleConfig } from '@/utils/sysConfig'
import { mapState } from 'vuex'

export default {

    beforeMount() {
        // 菜单的默认打开 默认选中
        this.currentRouterInfo = this.$router.currentRoute;
        this.$router.afterEach((to, from) => {
            this.currentRouterInfo = to || {};
        })
    }

}