<template>
	<div>
		<ul class="menu">
			<li v-for="i of sidebars" :key="i.menu">
				<router-link :to="i.link">{{i.menu}}</router-link>
			</li>
		</ul>
	</div>
</template>
<script>
export default{
	data(){
		return {
			sidebars : [
				{menu:"선수목록",link:"/list"},
				{menu:"조건별 선수검색",link:"/playersFindSome"},
				{menu:"선수성적수정",link:"/update"},
				{menu:"선수검색",link:"/playerFindOne"}
			]
		}
	}
}
</script>
<style scoped></style>