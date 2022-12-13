# `THEORY`

**DataInputStream and DataOutputStream**

- DataInputStream is used to read the primitive datatypes from an input source.
- DataOutputStream is used to write the primitive datatypes to an output source.

* We use the writeUTF() function to write a string to the output stream using UTF-8 encoding in portable manner.

- We use the readUTF() function to read a string of an input stream where UTF-8 encoding is used.

* These streams are located in java.io package.

##

**AWT(Abstract Window Toolkit)**

- AWT is an API(Application Programming Interface) for creating Graphical User Interface(GUI) that allows programmers to develop windows based applications.
- Java AWT components are platoform dependent.i.e components are displayed according to the view of OS.
- AWT is heavyweight. i.e it's components are using the resources of OS.
- java.awt package is used.

                          ACTIONLISTENER INTERFACE

- ActionListener in Java is an Interface that is responsible for handling action events such as when the user clicks the Button.

* The java ActionListener is notified whenever you click on the button or the menu button.

* It is notified against ActionEvent.
* ActionListener interface is found in java.awt.event package.
* The class which process the ActionEvent should implement the interface ActionListener.
* The object of the class must be registered using addActionListener(instanceoflistenerclassmethod) with a component.

                                               **JAVA-3rd programming questions**

* Write a java program to write a name, rollno, faculty and address of a student in a text file "detail.dat" that keep asking for the data until the user press n key to exit.

                **Answer:- Student.java**

- A data file "detail.dat" contains name, rollno, faculty and address of 3 students. Write a progaram to display only those records who belong to software faculty.

                **Answer:- Student2.java**

- Write a Java Program to fulfil the following requirements in which the simple form is created with a textfield and a button.

![CHEESE!](awt1st.png)

                 **Answer:- GUIForm.java**

- Write a Java Program to fulfil the following requirements in which the form contains a TextField, a Button and a Label. When we give the integer value to the textField, show the assigned integer value is even or odd in label as shown in below.

![CHEESE!](act12.png)

                   **Answer:- ActionListener1st.java**
