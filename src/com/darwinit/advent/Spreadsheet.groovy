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

	def computeDivision() {
		return rows.inject(0, {
			result, row -> result+row.collect({element -> row.split({ value -> (value!=element) && (value % element==0) })[0].flatten()[0] ?.intdiv(element) })
					 				 .find({value -> value !=null })
		})
	}
}
