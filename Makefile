build:
	javac $(shell find ./src -name *.java) -d ./bin

basic:
	java -cp ./bin com.malma.belajarjava.p1basic.Program

helloworld:
	java -cp ./bin com.malma.belajarjava.p2helloworld.Program

localvariable:
	java -cp ./bin com.malma.belajarjava.p3localvariable.Program

datatype:
	java -cp ./bin com.malma.belajarjava.p4datatype.Program