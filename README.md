# Simple Java RPC
This project demonstrates how to implement [Java RMI](https://en.wikipedia.org/wiki/Java_remote_method_invocation). The project is intended to run both an RMI client and am RMI server on the same machine, real or virtual.

**NOTE:** The project requires that the [Java JDK](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html) is installed on the host machine where the client and server are running.

## Description

The Java RMI server that is part of this project published a single method, `echo(String message)`. The response to the method is a string that contains the message along with a timestamp.

The following is example of a response from the remote method, `echo(String message)` when the value of the message parameter is, `This is a simple message for RMI`.

```
Echoing [This is a simple message for RMI] at: Wed Mar 18 19:46:35 UTC 2020
```

## Installation

This example is intended to run both the RMI server and client on the same machine. The server will run under `localhost` at port `5000`.

**Step 1:** Compile the RMI server

`javac MyServer.java`

**Step 2:** Compile the RMI client

`javac MyClient`

**Step 3:** Compile the [RMI remote registry](https://docs.oracle.com/javase/7/docs/technotes/tools/solaris/rmiregistry.html)

`javac RMIInterface.java`

**Step 4:** In a separate terminal window start the RMI server

`java MyServer`

You will get response at the command line as follows:

`Server is up and running!`


**Step 5:** Start the RMI Registry

`rmiregistry 5000`

**Step 6:** In a separate terminal window invoke the RMI client

`java MyClient`

You will get a prompt at follows:

`Enter a message: `

**Step 7:** Copy this message into the command prompt to enter a message.

`This is a simple message for RMI`{{copy}}

and then strikethe `ENTER` key

You will get output at the command line as follows:

`Echoing: This is a simple message for RMI`

**Step 8:** Review the output from the terminal window where ther server is running

Go over the terminal window where the RMI Server is running. You will see output similar to the following:

`Echoing [This is a simple message for RMI] at: Wed Mar 18 19:46:35 UTC 2020`


