package com.baidu.bugbye.eclipseplugin.utils;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
/**
 * @description
 * @author hubo09 gaosai01
 * @Date 2021年1月11日
 */
public class SystemUtils {
       
    /**
     * 获取mac地址
     * @throws UnknownHostException
     * @throws SocketException
     */
    private static String getMacAddress() throws UnknownHostException, SocketException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        return getLocalMac(inetAddress);
    }
    
    /**
     * 通过ip获取mac地址
     * @param inetAddress
     * @throws SocketException
     */
    private static String getLocalMac(InetAddress inetAddress) throws SocketException {
        
        //获取网卡，获取地址
        byte[] mac = NetworkInterface.getByInetAddress(inetAddress).getHardwareAddress();
        StringBuffer buffer =new StringBuffer("");
        for(int i = 0; i < mac.length; i++) {
            if(i != 0) {
                buffer.append("-");
            }
            //字节转换为整数
            int temp = mac[i] &0xff;
            String str =Integer.toHexString(temp);
            if(str.length()== 1) {
                buffer.append("0" + str);
            }else {
                buffer.append(str);
            }
        }
        return buffer.toString().toUpperCase();
    }
    
}
