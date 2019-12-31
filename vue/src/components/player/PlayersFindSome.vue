<template>
	<div class="search-form">
    <form>
        <h2 class="text-center">조건 검색</h2>
		<a>데뷔년차별 1등과 최하위 학생</a>       
        <div class="form-group">
            <input v-model="searchWord" type="text" class="form-control" placeholder="검색어입력" required="required">
        </div>
        <div class="form-group">
			<button @click.prevent="find" type="submit" class="btn btn-primary btn-block">전송</button>
        </div>
		<a @click.prevent="namesOfStudents">1. 학생의 이름</a>
		<a @click.prevent="streamToArray">2. 스트림을 배열로 전환</a>
		<a @click.prevent="streamToMap">3. 스트림을 맵으로 전환. 학생이름이  key</a>
		<a @click.prevent="theNumberOfStudents">4. 학생의 수</a>
		<a @click.prevent="totalScore">5. 학생들 총점</a>
		<a @click.prevent="topStudent">6. 1등 학생</a>
		<a @click.prevent="getStat">7. 전체 학생 성적 통계</a>
		<a @click.prevent="nameList">8. 전체 학생 이름</a>
		<a @click.prevent="partioningByGender">1.단순분할 (성별로 분할) 남성 true  여성 false</a>
		<a @click.prevent="partioningCountPerGender">2.단순분할 (성별 학생수)</a>
		<a @click.prevent="partioningTopPerGender">3.단순분할 (성별 1등) 남성 true  여성 false</a>
		<a @click.prevent="partioningRejectPerGender">4.다중분할 (성별 불합격자,  50점이하) 남성 true 여성 false</a>
		<a @click.prevent="groupingByBan">1. 단순 그룹화(반별로 그룹화)</a>
		<a @click.prevent="groupingByGrade">2. 단순그룹화(성적별로 그룹화)</a>
		<a @click.prevent="groupingByCountByLevel">3. 단순그룹화 + 통계(성적별 학생수)</a>
		<a @click.prevent="groupingByHak">4. 다중 그룹화 (학년별)</a>
		<a @click.prevent="groupingByHakAndBan">5. 다중 그룹화 (학년별, 반별)</a>
		<a @click.prevent="groupingTopByHakAndBan">6. 다중 그룹화 +통계 (학년별, 반별  1등)</a>
		<a @click.prevent="groupingByStat">7. 다중그룹화 + 통계(학년별, 반별  성적그룹)</a>
    </form>
	</div>
<!-- 	<div>선수 목록
		<table class="table">
			<tr>
			<th>No.</th><th>아이디</th><th>비번</th><th>이름</th><th>생년월일</th>
			<th>성별</th><th>데뷔년</th><th>그룹번호</th><th>스탯</th>
			</tr>
		<tr v-for="(j, i) of list" :key="j.id">
		<td>{{i+1}}</td><td>{{j.userid}}</td><td>{{j.passwd}}</td><td>{{j.name}}</td><td>{{j.birthday}}</td><td>{{j.gender}}</td><td>{{j.hak}}</td><td>{{j.ban}}</td><td>{{j.score}}</td>
		</tr>
		</table>
	</div> -->
</template>
<script>
import axios from 'axios'
export default{
	data() {
		return {
			context: 'http://localhost:8080/',
			list: [],
			searchWord:''
		}
	},
	methods : {
		find() {
			axios
			.get(`${this.context}/players/searchWord`)
			.then(res =>{
				this.list = res.data
			})
			.catch(e=>{
				alert('AXIOS FAIL'+e)
			})
		},
		groupingByHak(){
			alert('검색어 :'+ this.searchWord) // 1학년 학생목록
			axios
			.get(`${this.context}/players/search/${this.searchWord}`)
			.then(res =>{
				this.list = res.data
			})
			.catch(e=>{
				alert('AXIOS FAIL'+e)
			})
		},
		partioningByGender(){
			alert('검색어:'+this.searchWord)
			axios
			.get(`${this.context}/players/search/${this.searchWord}`)
			.then(res =>{
				this.list = res.data
			})
			.catch(e=>{
				alert('AXIOS FAIL'+e)
			})
		}
	}
}
</script>
<style scoped type="text/css">
.search-form {
	width: 340px;
	margin: 50px auto;
}
.search-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}
.search-form h2 {
	margin: 0 0 15px;
}
.form-control, .btn {
	min-height: 38px;
	border-radius: 2px;
}
.btn {        
	font-size: 15px;
	font-weight: bold;
}
</style>