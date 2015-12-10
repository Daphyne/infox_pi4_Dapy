package br.com.infox.arquivo;



	
	public class FileEntity {
	  
	    private long id;

		private String name;
	 
	    private String year;
	  
	    private String month;
	 
	    private String type;
	  
	    public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

}
