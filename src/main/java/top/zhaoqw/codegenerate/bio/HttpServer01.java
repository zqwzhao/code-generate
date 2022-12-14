package top.zhaoqw.codegenerate.bio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhaoqw
 * @date 2022/11/17
 */
public class HttpServer01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8818);
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                service(socket);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void service(Socket socket) {
        try {
            Thread.sleep(20);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            printWriter.println();
            printWriter.write("hello,nio");
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
