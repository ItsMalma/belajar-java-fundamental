build:
	javac $(shell find ./src -name *.java) -d ./bin

basic:
	java -cp ./bin com.malma.belajarjava.basic.Program

helloworld:
	java -cp ./bin com.malma.belajarjava.helloworld.Program

localvariable:
	java -cp ./bin com.malma.belajarjava.localvariable.Program