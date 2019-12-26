import Vue from 'vue'
import App from '@/components/Home.vue'
import vueRouter from 'vue-router'
import router from './router'
import axios from 'axios'
import vuex from 'vuex'
import {store} from './store'
import VSwitch from 'v-switch-case'
Vue.use(VSwitch)
Vue.use(vueRouter)
Vue.config.productionTip = false
vueRouter.prototype.$http = axios
new Vue({
  router,
  vuex,
  axios,
  vueRouter,
  store,
  render: h => h(App)
}).$mount('#app')