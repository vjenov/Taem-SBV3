export default {
	state: {
		context: 'http://localhost:8080/',
		person: {},
		sidebars : [
                {menu:"선수목록",link:"/players"},
				{menu:"조건별 선수검색",link:"/playersFindSome"},
				{menu:"선수성적수정",link:"/update"},
				{menu:"선수검색",link:"/playerFindOne"}
			],
		authCheck: false,
		headerMessage: '공통 화면',
		errorState: ''
	}
}