import { mapGetters } from 'vuex'
export default {
	computed: {
		...mapGetters([
			'doneTodosCount',
			'anotherGetter'
		])
	},
  getPerson: state => state.person,
  getErrorState: state => state.errorState,
  getIsAuth: state => state.isAuth,
  getContext: state => state.context,
  getSidebars: state => state.sidebars,
  getHeaderMessgae : state => state.headerMessgae
}