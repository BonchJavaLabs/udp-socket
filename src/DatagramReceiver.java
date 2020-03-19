import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramReceiver {
    private static final int PORT = 0;
    private static final int BUFFER_SIZE = 0;
    private static final int PACKET_LENGTH = 0;
    private static final int DEFAULT_OFFSET = 0;

    public static void main(String[] args) throws Exception {
        //TODO: задайте корректное значение константы PORT
        DatagramSocket datagramSocket = new DatagramSocket(PORT);
        //TODO: задайте значение константы BUFFER_SIZE так, чтобы буфер мог вместить один килобайт
        byte[] buffer = new byte[BUFFER_SIZE];
        //TODO: задайте длину пакета в соответствии с размером буфера
        DatagramPacket datagramPacket = new DatagramPacket(buffer, PACKET_LENGTH);
        //TODO: вызовите метод, отвечающий за получение пакета
        //datagramSocket./*МЕТОД ПОЛУЧЕНИЯ ПАКЕТА*/(datagramPacket);
        //TODO: подставьте необходимые методы
        //String message = new String(
        //        datagramPacket./*МЕТОД ПОЛУЧЕНИЯ ДАННЫХ ИЗ ПАКЕТА*/(),
        //        DEFAULT_OFFSET, datagramPacket./*МЕТОД ПОЛУЧЕНИЯ ДЛИНЫ ПАКЕТА*/()
        //);
        //TODO: выведете сообщение и закройте сокет
        //System.out.println(message);
        //datagramSocket./**/();
    }
}
