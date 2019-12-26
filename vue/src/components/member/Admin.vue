<template>
<table>
	<tr>
		<td><h2>관리자 화면</h2></td>
		<td>
			<legend><h3>비밀번호 </h3></legend>
			<h5>{{person.passwd}}</h5>
			<button>수정</button><br/><br/>
		</td>
	</tr>
	<tr>
		<td><legend><h3>선수 관리</h3></legend>
			<h5>{{person.hak}} 데뷔년도</h5>
			<h5>{{person.ban}} 그룹번호</h5>
			<h5>{{person.score}}점수</h5>
			<br/><br/>
			<button @click.prevent="goUpdate">수정</button>
		</td>
	</tr>
</table>
</template>
<script>
import {store} from "../../store"
export default {
	data() {
		return {
			context : 'http://localhost:8080/',
			name: store.state.name,
			person : store.state.person,
			sidebars: [
						{menu:"학생등록",link:"/write"},
						{menu:"학생목록",link:"/list"},
						{menu:"학생정보수정",link:"/update"},
						{menu:"학생정보삭제",link:"/remove"},
						{menu:"학생검색",link:"/search"}
			], authCheck : true
		}
	},
	methods : {
		goUpdate(){
		this.$router.push({path: '/myPageUpdate'})
		}
	}
}
</script>
<style scoped>
    .back {width: 700px; margin: 0 ;}
    .sub {width: 100%; height: 600px; margin: 0 auto; text-align: center;}
    .pull-left {float: left;}
    .pull-right {float: right;}
    .top {margin-top: 1%;}
    .rt {margin-right: 1%;}
    .size {width: 49.5%; height: 100%;}
</style>