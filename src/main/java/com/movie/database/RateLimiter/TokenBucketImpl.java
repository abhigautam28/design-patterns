package com.movie.database.RateLimiter;

import java.time.LocalDateTime;

public class TokenBucketImpl {

//    schema that u need [userid, lastRiffiledTime,  currentToken]
    private int bucketCapacity;
    private long token;
    private long lastRiffiledTime;
    private long refillRatePerSec;

    public TokenBucketImpl(int bucketCapacity, int token, long lastRiffiledTime, int refillRatePerSec) {
        this.bucketCapacity = bucketCapacity;
        this.token = token;
        this.lastRiffiledTime = lastRiffiledTime;
        this.refillRatePerSec = refillRatePerSec;
    }

//    check for request will going to allow or drop.
    public boolean allowRequest(){
        long now = System.currentTimeMillis();
        long elapsed  = (now - lastRiffiledTime)/ (1000 * 60);
        token = Math.min(bucketCapacity, token + elapsed*refillRatePerSec);

        if(token>0) {
            lastRiffiledTime = now;
            token--;
            return true;
        }

        return false;
    }


}
