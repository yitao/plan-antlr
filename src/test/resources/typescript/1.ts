import AppHeader from '@components/AppHeader/AppHeader'
import NewSider from './components/NewSider'
import { getLocalString, setLocal, removeLocal } from '@utils/storage'
import { getMiddleConfig } from '@/utils/sysConfig'
import { mapState } from 'vuex'

export default {
    name: 'SysMain',
    components: {
        AppHeader,
        NewSider,
    },
    data() {
        return {
            collapsed: getLocalString('menuCollapsed') ? false : true,
            currentRouterInfo: {},
            hideHeader: getMiddleConfig().hideHeader
        }
    },

}