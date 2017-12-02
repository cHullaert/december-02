package com.darwinit.advent

class Spreadsheet {
	def rows=[]

	def add(value) {
		rows=rows << value.tokenize()
			 	  			.collect({v -> v.toInteger()})
	}
	
	def compute() {
		return rows.inject(0, {
			result, row -> result+row.max()-row.min()
		})		
	}
}
