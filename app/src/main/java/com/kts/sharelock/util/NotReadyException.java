package com.kts.sharelock.util;

public class NotReadyException extends Exception
{
    public NotReadyException(String msg)
    {
        super(msg);
    }
}
