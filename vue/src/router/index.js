import Router from 'vue-router'
import Home from '@/components/Home'
import Login from '@/components/member/Login'
import Join from '@/components/member/Join'
export default new Router({
	mode: 'history',
	routes: [
		{path:'/', name:'', component: null},
		{path:'/home', name:'home', component: Home},
		{path:'/login', name:'login', component: Login},
		{path:'/join', name:'join', component: Join},
		{path:'/', name:'home', component: Home},
		{path:'/', name:'home', component: Home},
		{path:'/', name:'home', component: Home},
		{path:'/', name:'home', component: Home},
	]
})