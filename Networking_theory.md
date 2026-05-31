## Reading and write data from stream

```
• Reading data from a stream: socket.getInputStream() - returns an InputStream. This is typically wrapped in a BufferedReader or DataInputStream for convenient reading.

// Reading from socket
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
String message = in.readLine();
#####################################################
• Writing data to a stream: socket.getOutputStream() — returns an OutputStream. Typically wrapped in a PrintWriter or DataOutputStream for convenient writing.

// Writing to socket
PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // true = auto-flush
out.println("Hello Server!");
```

## Socket API


_Step-by-Step Explanation of the Socket API Diagram_

```
Step 1: Server — socket(): The server creates a ServerSocket object. This allocates a network endpoint on the OS.

Step 2: Server — bind(): The ServerSocket is bound to a specific port number so the OS knows to route incoming traffic on that port to this process.

Step 3: Server — listen(): The server calls accept() which blocks, waiting for incoming client connection requests (Open Listen state).

Step 4: Client — socket(): The client creates a Socket object (Open Client state).

Step 5: Client — connect(): The client calls connect() with the server IP and port, sending a Connection Request to the server.

Step 6: Server — accept(): The server's accept() call returns a new Socket for this specific client. The Client/Server Session is now established.

Step 7: Client — write() / Server — read(): The client sends data using write(); the server receives it using read().

Step 8: Server — write() / Client — read(): The server sends a response using write(); the client reads it with read().

Step 9: End of File / close(): When communication is complete, an EOF signal is sent. Both sides call close() to release the socket and free system resources.
```

## Task of Java Socket Programming

```
Java Socket programming enables communication between two or more computers over a network using
the TCP/IP protocol. Its main tasks include:

• Establishing connections: A client socket connects to a server socket on a known host and port.

• Data exchange — Once connected, both sides use InputStream and OutputStream to send and receive
data bidirectionally.

• Protocol implementation: Sockets are used to build higher-level protocols such as HTTP, FTP, and
custom application protocols.

• Concurrent communication: Servers use ServerSocket.accept() in a loop, typically spawning a new
thread per client, enabling multiple simultaneous connections.

• Resource management: Sockets must be properly closed to release OS-level network resources.
```

## Info on Server

##### Before a client can connect to a server, it must know exactly two things:
```
1. IP Address (or Hostname) of the server: Identifies the machine on the network (e.g.,192.168.1.10 or www.example.com).

2. Port Number of the server: Identifies the specific process/service on that machine (e.g., port 8080 for a web server). Port numbers range from 0–65535; well-known ports are 0–1023.

In Java code: Socket socket = new Socket("192.168.1.10", 8080); the first argument is the IP/hostname and the second is the port.
```