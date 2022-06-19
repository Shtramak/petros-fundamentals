package com.bobocode.hw2.warmup.sockets.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static com.bobocode.hw2.warmup.sockets.server.ServerUtil.acceptClientSocket;
import static com.bobocode.hw2.warmup.sockets.server.ServerUtil.createServerSocket;
import static com.bobocode.hw2.warmup.sockets.server.ServerUtil.printMessage;
import static com.bobocode.hw2.warmup.sockets.server.ServerUtil.readMessageFromSocket;

/**
 * {@link MessageBoardServer} is a server application that allows clients to connect via socket and print a message.
 * It opens a server socket on a given port and waits for a client to connect using a infinite loop. Once client is
 * connected this app reads a message from the connected socket input stream and prints it to the console.
 * <p>
 * It uses only one thread. So if multiple clients will try to connect at the same time, they will be waiting and will
 * be processed one by one.
 */
public class MessageBoardServer {
    public static final String HOST = ServerUtil.getLocalHost();
    public static final int PORT = 8899; // you can use any free port you want

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = createServerSocket(PORT)) {
            while (true) {
                try (Socket clientSocket = acceptClientSocket(serverSocket)) {
                    String message = readMessageFromSocket(clientSocket);
                    printMessage(clientSocket, message);
                }
            }
        }
    }
}
