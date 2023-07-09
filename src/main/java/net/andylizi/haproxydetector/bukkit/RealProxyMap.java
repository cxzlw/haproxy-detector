package net.andylizi.haproxydetector.bukkit;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RealProxyMap {
    public static Map<InetAddress, InetAddress> realToProxy = new ConcurrentHashMap<>();
    ;
    public static Map<InetAddress, InetAddress> proxyToReal = new ConcurrentHashMap<>();
    ;
}
