<template>
	<div class="wrapper">
	<header>
		<slot name="header" :title="headerTitle"></slot>
	</header>
	<aside>
		<slot name="sidebar"></slot>
	</aside>
	<section>
		<slot name="content" :title="contentTitle"></slot>
	</section>
	<footer>
		<slot name="footer" :title="footerTitle"></slot>
	</footer>
	</div>
</template>
<script>
export default{
	data() {
		return {
			headerTitle : "집에 가고싶다",
			contentTitle : "정말 가고싶다",
			footerTitle : "진짜 가고싶다"
		}
	}
}
</script>
<style scoped>
#wrapper {
     padding: 5px;
     width: 960px;
     margin: 20px auto;
}
header {
     height: 100px;
     padding: 0 15px;
}
#content {
     width: 696px;
     float: left;
     padding: 5px 15px;
    min-height: 300px;
}
#sidebar {
     width: 200px;
     padding: 5px 15px;
     float: left;
}
footer {
     clear: both;
     padding: 0 15px;
}@media screen and (max-width: 980px) {     
     #pagewrap {
           width: 94%;
     }
     #content {
           clear: both;
           padding: 1% 4%;
           width: auto;
           float: none;
     }
     #sidebar {
           clear: both;
           padding: 1% 4%;
           width: auto;
           float: none;
     }
     header, footer {
           padding: 1% 4%;
     }
}
#content {
     background: #f8f8f8;
}
#sidebar {
     background: #f0efef;
}
header, #content, #middle, #sidebar {
     margin-bottom: 5px;
}
#pagewrap, header, #content, #middle, #sidebar, footer {
     border: solid 1px #ccc;
}
</style>