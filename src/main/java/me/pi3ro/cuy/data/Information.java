// 
// Decompiled by Procyon v0.6.0
// 

package me.pi3ro.cuy.data;

import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000e
                                                   \u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B	\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010\u0007R\u0014\u0010
                                                   \u001a\u00020\u0005X\u0086D¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012""" }, d2 = { "Lme/pi3ro/cuy/data/Information;", "", "<init>", "()V", "userId", "", "getUserId", "()Ljava/lang/String;", "username", "getUsername", "resourceId", "getResourceId", "resourceVersion", "getResourceVersion", "downloadTimeStamp", "getDownloadTimeStamp", "nonce", "getNonce", "cuy-plugin" })
public final class Information
{
    @NotNull
    public static final Information INSTANCE;
    @NotNull
    private static final String userId;
    @NotNull
    private static final String username;
    @NotNull
    private static final String resourceId;
    @NotNull
    private static final String resourceVersion;
    @NotNull
    private static final String downloadTimeStamp;
    @NotNull
    private static final String nonce;
    
    private Information() {
    }
    
    @NotNull
    public final String getUserId() {
        return Information.userId;
    }
    
    @NotNull
    public final String getUsername() {
        return Information.username;
    }
    
    @NotNull
    public final String getResourceId() {
        return Information.resourceId;
    }
    
    @NotNull
    public final String getResourceVersion() {
        return Information.resourceVersion;
    }
    
    @NotNull
    public final String getDownloadTimeStamp() {
        return Information.downloadTimeStamp;
    }
    
    @NotNull
    public final String getNonce() {
        return Information.nonce;
    }
    
    static {
        INSTANCE = new Information();
        userId = "623687";
        username = "NaxzyAuxxy";
        resourceId = "57603";
        resourceVersion = "261474";
        downloadTimeStamp = "1771102375";
        nonce = "37bfda9d8a36057286e1b90ee808fe53";
    }
}
