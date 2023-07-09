package net.andylizi.haproxydetector.bukkit;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RealProxyMap {
    public static Map<InetSocketAddress, InetSocketAddress> realToProxy = new ConcurrentHashMap<>();
    ;
    public static Map<InetSocketAddress, InetSocketAddress> proxyToReal = new ConcurrentHashMap<>();
    ;
}
