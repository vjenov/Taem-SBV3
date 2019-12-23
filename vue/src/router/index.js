import Router from 'vue-router'
import Home from '@/components/Home'
import Login from '@/components/member/Login'
import Join from '@/components/member/Join'
import MyPage from  '@/components/member/MyPage'
/* import List from  '@/components/board/List'
import Remove from  '@/components/board/Remove'
import Update from  '@/components/board/Update'
import Search from  '@/components/board/Search'
import Write from  '@/components/board/Write' */
export default new Router({
	mode: 'history',
	routes: [
		{path:'/', name:'', component: null},
		{path:'/home', name:'home', component: Home},
		{path:'/login', name:'login', component: Login},
		{path:'/join', name:'join', component: Join},
		{path:'/myPage', name:'myPage', component: MyPage},
	/* 	{path:'/list', name:'list', component: List},
		{path:'/remove', name:'remove', component: Remove},
		{path:'/update', name:'update', component: Update},
		{path:'/search', name:'search', component: Search},
		{path:'/write', name:'write', component: Write} */
	]
})