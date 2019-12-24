/* <template>
	<div id="app">
		<Layout>
			<template #header="header">
				<h1>{{header.title}}</h1>
        <input type="button" value="로그아웃" @click="logout"/>로그아웃<br></router-link>
        <a @click.prevent="Withdrawal"><h2 align="center">회원탈퇴</h2></a>
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
</template> */
<template>
  <div class="back">
     <div align = "center"><h1><input type="text" v-model="person.name"/>님의 Mypage</h1> <input type="button" value="로그아웃" @click="logout"/></div>
      <div class="sub">
        <div class="pull-left rt size" >
           <fieldset style=" margin-top: 1%; height: 31.5%;border: 2px solid black;">
             <legend><h3>비밀번호 변경</h3></legend>
                <input type="text" name="pwd" size="20" placeholder="기존 비밀번호 입력" v-model="person.pwd"  style="float: none; width: 70%;">
                <button style="height: 38%; width: 20%; float: right;">수정</button><br/><br/>
           </fieldset>
           <fieldset style="margin-top: 1%; height: 60%;border: 2px solid black;">
              <legend><h3>개인정보 변경</h3></legend>
                <input type="text" name="pwd" size="20" placeholder="변경할 생일 입력" v-model="person.birthday"  style="float: none;width: 70%;">
                <input type="text" name="pwd" size="20" placeholder="변경할 성별  입력" v-model="person.gender" style="float: none;width: 70%;">
                <input type="text" name="pwd" size="20" placeholder="변경할 학년  입력" v-model="person.hak" style="float: none;width: 70%;">
                <input type="text" name="pwd" size="20" placeholder="변경할 반 입력" v-model="person.ban"  style="float: none;width: 70%;">
                <input type="text" name="pwd" size="20" placeholder="변경할 성적 입력" v-model="person.score"   style="float: none;width: 70%;">
                <br/><br/>
                <button style="height: 20%; width: 70%; float: none;" @click.prevent="modify">수정</button>
           </fieldset>
        </div>
        <div class="pull-right size" >
            <fieldset style="height: 49%;border: 2px solid black;">
                <legend><h3>정보보기</h3></legend>
                <a href="#" ><h3>예약리스트 보기</h3></a>
                <a href="#" ><h3 align = "center">내업체 보기</h3></a>
                <a href="#" ><h3 align = "center">업체 등록 하기</h3></a>
            </fieldset>
            <fieldset style="margin-top: 1%; height: 47.5%; border: 2px solid black;">
              <legend><h3>등록업체 삭제</h3></legend>
              <select name="pat" id="pattype" style="height: 21.5px; vertical-align:middle;">
               <option value="LargeDog">업체1</option>
               <option value="LargeDog">업체2</option>
               <option value="SmallDog">업체3</option>
               <input type="text" placeholder="직접입력" style="float: none; width: 70%;">
              </select>
                <button style="width: 20%; float: right;">등록</button><br/><br/>
              <a @click.prevent="Withdrawal"><h2 align="center">회원탈퇴</h2></a>
            </fieldset>
        </div>
      </div>
    </div>
</template>
<script>
import Layout from "@/components/cmm/Layout.vue"
import axios from "axios"
import {store} from "../../store"
export default {
  components : {Layout},
	data() {
		return{
      context: 'http://localhost:8080/',
      id : store.state.id,
      userid : store.state.userid,
      passwd : store.state.passwd,
      name : store.state.name,
      birthday : store.state.birthday,
      gender : store.state.gender,
      hak : store.state.hak,
      ban : store.state.ban,
      score : store.state.score
		}
  },
  methods : {
    logout(){
      alert('로그아웃!!!')
      store.state.loginedUid = ''
      store.state.loginedPwd = ''
      store.state.name = ''
      store.state.birthday = ''
      store.state.id = ''
      this.$router.push({path : '/login'})
    },
    withdrawal(){
      alert('회원탈퇴!!!')
      let url = `${this.context}/withdrawal/${store.state.loginedUid}`
      axios.delete(url).then(()=>{
        alert(`axios ${store.state.loginedUid}님의 회원탈퇴`)
				this.$router.push({path : '/login'})
			}).catch(()=>{
				alert('axios 실패')
			})
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