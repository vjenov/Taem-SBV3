<template>
	<div id="app">
		<Layout>
			<template #header="header">
				<h1>{{header.title}}</h1>
			</template>
			<template #sidebar="sidebar">
				<ul class="menu">
				<li v-for="i of sidebars" :key="i.menu">
				<router-link :to="i.link">{{i.menu}}<br></router-link>
				</li>
				</ul>
			</template>
			<template #content="content">
				<div>
				<router-view/>
				</div>
			</template>
			<template #footer="footer">
				<footer>
				{{footer.title}}
				</footer>
			</template>
		</Layout>
	</div>
</template>
<script>
import Layout from "@/components/cmm/Layout.vue"
export default {
	components : {Layout},
	data() {
		return {
			sidebars: [
				{menu : "Home", link: "/"},
				{menu : "로그인", link: "/login"},
				{menu : "조인", link: "/join"},
				{menu : "글쓰기", link: "/write"},
				{menu : "목록", link: "/list"},
				{menu : "글수정", link: "/update"},
				{menu : "글삭제", link: "/remove"},
				{menu : "검색", link: "/search"},
				{menu : "마이페이지", link: "/myPage"}
			]
		}
	}
}
</script>
<style scoped>
ul.menu {
	position:relative;
	padding: 5px 5px 5px 5px;
	list-style: none;
	font-style: italic;
}
ul.menu a {
	text-decoration:none;
}
</style>
