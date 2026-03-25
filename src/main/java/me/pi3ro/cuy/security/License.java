// 
// Decompiled by Procyon v0.6.0
// 

package me.pi3ro.cuy.security;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonPrimitive;
import org.apache.http.client.methods.CloseableHttpResponse;
import kotlin.io.CloseableKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.Json;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.methods.HttpUriRequest;
import java.io.Closeable;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import me.pi3ro.cuy.data.LicenseResponse;
import org.jetbrains.annotations.NotNull;
import java.net.URI;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.Metadata;

@Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00008
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b	\u0010
                                                   J\u0010\u0010 \u001a
                                                    "*\u0004\u0018\u00010!0!H\u0002J\b\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\u0017R"\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010\u000eR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082D¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082D¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082D¢\u0006\u0002
                                                   \u0000¨\u0006'""" }, d2 = { "Lme/pi3ro/cuy/security/License;", "", "host", "Ljava/net/URI;", "licenseKey", "", "product", "version", "hwid", "<init>", "(Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/net/URI;", "getLicenseKey", "()Ljava/lang/String;", "getProduct", "getVersion", "getHwid", "response", "Lme/pi3ro/cuy/data/LicenseResponse;", "getResponse", "()Lme/pi3ro/cuy/data/LicenseResponse;", "setResponse", "(Lme/pi3ro/cuy/data/LicenseResponse;)V", "value", "errorMessage", "getErrorMessage", "jwtToken", "maxRetries", "", "connectionTimeout", "socketTimeout", "createHttpClient", "Lorg/apache/http/impl/client/CloseableHttpClient;", "kotlin.jvm.PlatformType", "authenticate", "", "check", "getErrorDetails", "cuy-plugin" })
@SourceDebugExtension({ """
                        SMAP
                        License.kt
                        Kotlin
                        *S Kotlin
                        *F
                        + 1 License.kt
                        me/pi3ro/cuy/security/License
                        + 2 Json.kt
                        kotlinx/serialization/json/Json
                        *L
                        1#1,164:1
                        222#2:165
                        *S KotlinDebug
                        *F
                        + 1 License.kt
                        me/pi3ro/cuy/security/License
                        *L
                        121#1:165
                        *E
                        """ })
public final class License
{
    @NotNull
    private final URI host;
    @NotNull
    private final String licenseKey;
    @NotNull
    private final String product;
    @NotNull
    private final String version;
    @NotNull
    private final String hwid;
    @Nullable
    private LicenseResponse response;
    @Nullable
    private String errorMessage;
    @Nullable
    private String jwtToken;
    private final int maxRetries;
    private final int connectionTimeout;
    private final int socketTimeout;
    
    public License(@NotNull final URI host, @NotNull final String licenseKey, @NotNull final String product, @NotNull final String version, @NotNull final String hwid) {
        Intrinsics.checkNotNullParameter((Object)host, "host");
        Intrinsics.checkNotNullParameter((Object)licenseKey, "licenseKey");
        Intrinsics.checkNotNullParameter((Object)product, "product");
        Intrinsics.checkNotNullParameter((Object)version, "version");
        Intrinsics.checkNotNullParameter((Object)hwid, "hwid");
        this.host = host;
        this.licenseKey = licenseKey;
        this.product = product;
        this.version = version;
        this.hwid = hwid;
        this.maxRetries = 2;
        this.connectionTimeout = 45000;
        this.socketTimeout = 45000;
    }
    
    @NotNull
    public final URI getHost() {
        return this.host;
    }
    
    @NotNull
    public final String getLicenseKey() {
        return this.licenseKey;
    }
    
    @NotNull
    public final String getProduct() {
        return this.product;
    }
    
    @NotNull
    public final String getVersion() {
        return this.version;
    }
    
    @NotNull
    public final String getHwid() {
        return this.hwid;
    }
    
    @Nullable
    public final LicenseResponse getResponse() {
        return this.response;
    }
    
    public final void setResponse(@Nullable final LicenseResponse response) {
        this.response = response;
    }
    
    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    private final CloseableHttpClient createHttpClient() {
        return HttpClients.custom().setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(this.connectionTimeout).setSocketTimeout(this.socketTimeout).setConnectionRequestTimeout(this.connectionTimeout).build()).build();
    }
    
    private final boolean authenticate() {
        final int n = this.maxRetries + 1;
        int i = 0;
        while (i < n) {
            final int n2 = i;
            final HttpPost httpPost2;
            final HttpPost httpPost = httpPost2 = new HttpPost(this.host.resolve("/api/authenticate"));
            httpPost2.setHeader("Content-Type", "application/json");
            httpPost2.setEntity((HttpEntity)new StringEntity("{\n                        \"licenseKey\": \"" + this.licenseKey + "\",\n                        \"product\": \"" + this.product + "\",\n                        \"version\": \"" + this.version + "\",\n                        \"hwid\": \"" + this.hwid + "\"\n                    }", ContentType.APPLICATION_JSON));
            final HttpPost httpPost3 = httpPost;
            try {
                final Closeable closeable = (Closeable)this.createHttpClient();
                Throwable t = null;
                try {
                    final CloseableHttpResponse execute = ((CloseableHttpClient)closeable).execute((HttpUriRequest)httpPost3);
                    final int statusCode = execute.getStatusLine().getStatusCode();
                    if (statusCode != 200) {
                        this.errorMessage = "Auth Error: " + execute.getStatusLine().getReasonPhrase() + " (Code: " + statusCode;
                        return false;
                    }
                    final String string = EntityUtils.toString(execute.getEntity());
                    final Json.Default default1 = Json.Default;
                    Intrinsics.checkNotNull((Object)string);
                    final JsonElement jsonElement = (JsonElement)JsonElementKt.getJsonObject(default1.parseToJsonElement(string)).get((Object)"token");
                    String content = null;
                    Label_0252: {
                        if (jsonElement != null) {
                            final JsonPrimitive jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement);
                            if (jsonPrimitive != null) {
                                content = jsonPrimitive.getContent();
                                break Label_0252;
                            }
                        }
                        content = null;
                    }
                    this.jwtToken = content;
                    final CharSequence charSequence = this.jwtToken;
                    if (charSequence == null || charSequence.length() == 0) {
                        this.errorMessage = "Invalid token received from server";
                        return false;
                    }
                    return true;
                }
                catch (final Throwable t2) {
                    t = t2;
                    throw t2;
                }
                finally {
                    CloseableKt.closeFinally(closeable, t);
                }
            }
            catch (final Exception ex) {
                if (n2 < this.maxRetries) {
                    System.out.println("Authentication attempt " + (n2 + 1) + " failed: " + ex.getMessage() + ". Retrying...");
                    Thread.sleep(2000L);
                }
                else {
                    this.errorMessage = "Connection Error after " + this.maxRetries + " retries: " + ex.getMessage();
                    ex.printStackTrace();
                }
                ++i;
                continue;
            }
            break;
        }
        return false;
    }
    
    public final boolean check() {
        if (this.jwtToken == null && !this.authenticate()) {
            return false;
        }
        final int n = this.maxRetries + 1;
        int i = 0;
        while (i < n) {
            final int n2 = i;
            final HttpPost httpPost2;
            final HttpPost httpPost = httpPost2 = new HttpPost(this.host.resolve("/api/client"));
            httpPost2.setHeader("Authorization", "Bearer " + this.jwtToken);
            httpPost2.setHeader("Content-Type", "application/json");
            httpPost2.setEntity((HttpEntity)new StringEntity("{\n                        \"licenseKey\": \"" + this.licenseKey + "\",\n                        \"product\": \"" + this.product + "\",\n                        \"version\": \"" + this.version + "\",\n                        \"hwid\": \"" + this.hwid + "\"\n                    }", ContentType.APPLICATION_JSON));
            final HttpPost httpPost3 = httpPost;
            try {
                final Closeable closeable = (Closeable)this.createHttpClient();
                Throwable t = null;
                try {
                    final CloseableHttpResponse execute = ((CloseableHttpClient)closeable).execute((HttpUriRequest)httpPost3);
                    final int statusCode = execute.getStatusLine().getStatusCode();
                    if (statusCode != 200) {
                        this.errorMessage = "License Error: " + execute.getStatusLine().getReasonPhrase() + " (Code: " + statusCode;
                        return false;
                    }
                    final String string = EntityUtils.toString(execute.getEntity());
                    final Json json = (Json)Json.Default;
                    Intrinsics.checkNotNull((Object)string);
                    final String s = string;
                    final Json json2 = json;
                    json.getSerializersModule();
                    this.response = (LicenseResponse)json2.decodeFromString((DeserializationStrategy)BuiltinSerializersKt.getNullable((KSerializer)LicenseResponse.Companion.serializer()), s);
                    final LicenseResponse response = this.response;
                    if (response != null) {
                        final LicenseResponse licenseResponse = response;
                        boolean b;
                        if (licenseResponse.getStatus_code() != 200) {
                            this.errorMessage = "License Error: " + licenseResponse.getStatus_msg() + " (Code: " + licenseResponse.getStatus_code();
                            b = false;
                        }
                        else if (!Intrinsics.areEqual((Object)licenseResponse.getStatus_overview(), (Object)"success")) {
                            this.errorMessage = "License Status: " + licenseResponse.getStatus_overview() + " - " + licenseResponse.getStatus_msg();
                            b = false;
                        }
                        else if (licenseResponse.getPlugin_data().length() == 0) {
                            this.errorMessage = "Invalid plugin data received";
                            b = false;
                        }
                        else {
                            b = true;
                        }
                        return b;
                    }
                    this.errorMessage = "Empty response from server";
                    return false;
                }
                catch (final Throwable t2) {
                    t = t2;
                    throw t2;
                }
                finally {
                    CloseableKt.closeFinally(closeable, t);
                }
            }
            catch (final Exception ex) {
                if (n2 < this.maxRetries) {
                    System.out.println("License check attempt " + (n2 + 1) + " failed: " + ex.getMessage() + ". Retrying...");
                    Thread.sleep(2000L);
                }
                else {
                    this.errorMessage = "Connection Error after " + this.maxRetries + " retries: " + ex.getMessage();
                    ex.printStackTrace();
                }
                ++i;
                continue;
            }
            break;
        }
        return false;
    }
    
    @NotNull
    public final String getErrorDetails() {
        String errorMessage;
        if ((errorMessage = this.errorMessage) == null) {
            errorMessage = "No error details available";
        }
        return errorMessage;
    }
}
