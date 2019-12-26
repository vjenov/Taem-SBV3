import Vue from 'vue'
import Router from 'vue-router'
import List from '@/components/member/PlayerList'
import Articles from '@/components/board/Articles'
import ArticleRemoval from '@/components/board/ArticleRemoval'
import ArticleFindOne from '@/components/board/ArticleFindOne'
import ArticlesFindSome from '@/components/board/ArticlesFindSome'
import ArticleEdit from '@/components/board/ArticleEdit'
import ArticleAdd from '@/components/board/ArticleAdd'
import Join from '@/components/member/Join'
import Login from '@/components/member/Login'
import MyPage from '@/components/member/MyPage'
import MyPageUpdate from '@/components/member/MyPageUpdate'
import Admin from '@/components/member/Admin'

Vue.use(Router)

export default new Router({
	mode: 'history',
	routes : [
		{path: '/list',name: 'list', component: List},
		{path: '/articles',name: 'articles', component: Articles},
		{path: '/articleRemoval',name: 'articleRemoval', component: ArticleRemoval},
		{path: '/articleEdit',name: 'articleEdit', component: ArticleEdit},
		{path: '/articleFindOne',name: 'articleFindOne', component: ArticleFindOne},
		{path: '/articlesFindSome',name: 'articlesFindSome', component: ArticlesFindSome},
		{path: '/articleAdd',name: 'articleAdd', component: ArticleAdd},
		{path: '/join',name: 'join', component: Join},
		{path: '/login',name: 'login', component: Login},
		{path: '/myPage',name: 'myPage', component: MyPage},
		{path: '/myPageUpdate',name: 'myPageUpdate', component: MyPageUpdate},
		{path: '/admin',name: 'admin', component: Admin}
	]
})