
public enum depart {
		MI("외과"), NI("내과"), SI("피부과"), TI("소아과"), VI("산부인과"),WI("비뇨기과");
		private String str;
		depart(String str) {
			this.str = str;
		} 
		public String getValue() {
			return this.str;
		}
	} 
