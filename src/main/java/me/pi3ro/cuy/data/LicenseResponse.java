// 
// Decompiled by Procyon v0.6.0
// 

package me.pi3ro.cuy.data;

import java.nio.charset.StandardCharsets;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import java.util.Random;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.encoding.Decoder;
import java.io.IOException;
import dbjrsyajbkgezbtp.ogwwobatgayyjyld;
import kotlinx.serialization.encoding.Encoder;
import kotlin.DeprecationLevel;
import kotlin.Deprecated;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlin.jvm.JvmStatic;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Serializable
@Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000@
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u001b
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002;<Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010	\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010
                                                   \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010	\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010
                                                   \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J	\u0010"\u001a\u00020\u0003H\u00c6\u0003J	\u0010#\u001a\u00020\u0003H\u00c6\u0003J	\u0010$\u001a\u00020\u0006H\u00c6\u0003J	\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J	\u0010+\u001a\u00020\u0003H\u00c6\u0003J	\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032
                                                   \b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032
                                                   \b\u0002\u0010	\u001a\u0004\u0018\u00010\u00032
                                                   \b\u0002\u0010
                                                   \u001a\u0004\u0018\u00010\u00032
                                                   \b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032
                                                   \b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u00101\u001a\u00020\u0006H\u00d6\u0001J	\u00102\u001a\u00020\u0003H\u00d6\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010	\u001a\u0004\u0018\u00010\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010
                                                   \u001a\u0004\u0018\u00010\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b!\u0010\u0016¨\u0006=""" }, d2 = { "Lme/pi3ro/cuy/data/LicenseResponse;", "", "status_msg", "", "status_overview", "status_code", "", "status_id", "version", "clientname", "discord_username", "discord_tag", "discord_id", "main_class", "plugin_data", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStatus_msg", "()Ljava/lang/String;", "getStatus_overview", "getStatus_code", "()I", "getStatus_id", "getVersion", "getClientname", "getDiscord_username", "getDiscord_tag", "getDiscord_id", "getMain_class", "getPlugin_data", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$cuy_plugin", "$serializer", "Companion", "cuy-plugin" })
public final class LicenseResponse
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String status_msg = status_msg;
    @NotNull
    private final String status_overview = status_overview;
    private final int status_code = status_code;
    @NotNull
    private final String status_id = status_id;
    @Nullable
    private final String version = version;
    @Nullable
    private final String clientname = clientname;
    @Nullable
    private final String discord_username = discord_username;
    @Nullable
    private final String discord_tag = discord_tag;
    @Nullable
    private final String discord_id = discord_id;
    @NotNull
    private final String main_class = main_class;
    @NotNull
    private final String plugin_data = plugin_data;
    
    public LicenseResponse(@NotNull final String status_msg, @NotNull final String status_overview, final int status_code, @NotNull final String status_id, @Nullable final String version, @Nullable final String clientname, @Nullable final String discord_username, @Nullable final String discord_tag, @Nullable final String discord_id, @NotNull final String main_class, @NotNull final String plugin_data) {
        Intrinsics.checkNotNullParameter((Object)status_msg, "status_msg");
        Intrinsics.checkNotNullParameter((Object)status_overview, "status_overview");
        Intrinsics.checkNotNullParameter((Object)status_id, "status_id");
        Intrinsics.checkNotNullParameter((Object)main_class, "main_class");
        Intrinsics.checkNotNullParameter((Object)plugin_data, "plugin_data");
        this.status_msg = status_msg;
        this.status_overview = status_overview;
        this.status_code = status_code;
        this.status_id = status_id;
        this.version = version;
        this.clientname = clientname;
        this.discord_username = discord_username;
        this.discord_tag = discord_tag;
        this.discord_id = discord_id;
        this.main_class = main_class;
        this.plugin_data = plugin_data;
    }
    
    @NotNull
    public final String getStatus_msg() {
        return this.status_msg;
    }
    
    @NotNull
    public final String getStatus_overview() {
        return this.status_overview;
    }
    
    public final int getStatus_code() {
        return this.status_code;
    }
    
    @NotNull
    public final String getStatus_id() {
        return this.status_id;
    }
    
    @Nullable
    public final String getVersion() {
        return this.version;
    }
    
    @Nullable
    public final String getClientname() {
        return this.clientname;
    }
    
    @Nullable
    public final String getDiscord_username() {
        return this.discord_username;
    }
    
    @Nullable
    public final String getDiscord_tag() {
        return this.discord_tag;
    }
    
    @Nullable
    public final String getDiscord_id() {
        return this.discord_id;
    }
    
    @NotNull
    public final String getMain_class() {
        return this.main_class;
    }
    
    @NotNull
    public final String getPlugin_data() {
        return this.plugin_data;
    }
    
    @NotNull
    public final String component1() {
        return this.status_msg;
    }
    
    @NotNull
    public final String component2() {
        return this.status_overview;
    }
    
    public final int component3() {
        return this.status_code;
    }
    
    @NotNull
    public final String component4() {
        return this.status_id;
    }
    
    @Nullable
    public final String component5() {
        return this.version;
    }
    
    @Nullable
    public final String component6() {
        return this.clientname;
    }
    
    @Nullable
    public final String component7() {
        return this.discord_username;
    }
    
    @Nullable
    public final String component8() {
        return this.discord_tag;
    }
    
    @Nullable
    public final String component9() {
        return this.discord_id;
    }
    
    @NotNull
    public final String component10() {
        return this.main_class;
    }
    
    @NotNull
    public final String component11() {
        return this.plugin_data;
    }
    
    @NotNull
    public final LicenseResponse copy(@NotNull final String s, @NotNull final String s2, final int n, @NotNull final String s3, @Nullable final String s4, @Nullable final String s5, @Nullable final String s6, @Nullable final String s7, @Nullable final String s8, @NotNull final String s9, @NotNull final String s10) {
        Intrinsics.checkNotNullParameter((Object)s, "status_msg");
        Intrinsics.checkNotNullParameter((Object)s2, "status_overview");
        Intrinsics.checkNotNullParameter((Object)s3, "status_id");
        Intrinsics.checkNotNullParameter((Object)s9, "main_class");
        Intrinsics.checkNotNullParameter((Object)s10, "plugin_data");
        return new LicenseResponse(s, s2, n, s3, s4, s5, s6, s7, s8, s9, s10);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "LicenseResponse(status_msg=" + this.status_msg + ", status_overview=" + this.status_overview + ", status_code=" + this.status_code + ", status_id=" + this.status_id + ", version=" + this.version + ", clientname=" + this.clientname + ", discord_username=" + this.discord_username + ", discord_tag=" + this.discord_tag + ", discord_id=" + this.discord_id + ", main_class=" + this.main_class + ", plugin_data=" + this.plugin_data;
    }
    
    @Override
    public int hashCode() {
        return (((((((((this.status_msg.hashCode() * 31 + this.status_overview.hashCode()) * 31 + Integer.hashCode(this.status_code)) * 31 + this.status_id.hashCode()) * 31 + ((this.version == null) ? 0 : this.version.hashCode())) * 31 + ((this.clientname == null) ? 0 : this.clientname.hashCode())) * 31 + ((this.discord_username == null) ? 0 : this.discord_username.hashCode())) * 31 + ((this.discord_tag == null) ? 0 : this.discord_tag.hashCode())) * 31 + ((this.discord_id == null) ? 0 : this.discord_id.hashCode())) * 31 + this.main_class.hashCode()) * 31 + this.plugin_data.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LicenseResponse)) {
            return false;
        }
        final LicenseResponse licenseResponse = (LicenseResponse)o;
        return Intrinsics.areEqual((Object)this.status_msg, (Object)licenseResponse.status_msg) && Intrinsics.areEqual((Object)this.status_overview, (Object)licenseResponse.status_overview) && this.status_code == licenseResponse.status_code && Intrinsics.areEqual((Object)this.status_id, (Object)licenseResponse.status_id) && Intrinsics.areEqual((Object)this.version, (Object)licenseResponse.version) && Intrinsics.areEqual((Object)this.clientname, (Object)licenseResponse.clientname) && Intrinsics.areEqual((Object)this.discord_username, (Object)licenseResponse.discord_username) && Intrinsics.areEqual((Object)this.discord_tag, (Object)licenseResponse.discord_tag) && Intrinsics.areEqual((Object)this.discord_id, (Object)licenseResponse.discord_id) && Intrinsics.areEqual((Object)this.main_class, (Object)licenseResponse.main_class) && Intrinsics.areEqual((Object)this.plugin_data, (Object)licenseResponse.plugin_data);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0016
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B	\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007""" }, d2 = { "Lme/pi3ro/cuy/data/LicenseResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lme/pi3ro/cuy/data/LicenseResponse;", "cuy-plugin" })
    public static final class Companion
    {
        private static int ACdOtmWr0b = 0;
        private transient int XfxyhEehtU = 781836675;
        private static byte[] gterqhizfs;
        private static String[] nothing_to_see_here;
        
        private Companion() {
            final int n = 0x2A8923FE ^ 0x5509FD3A;
            hjbvohzptwyksyoa(n, 1919782631);
            final int n2 = 0x6F27059D ^ (0x5C0A811 ^ Integer.parseInt("1728773551"));
            hjbvohzptwyksyoa(n2, 1842398558);
        }
        
        @NotNull
        public final KSerializer<LicenseResponse> serializer() {
            final int n = 0x3C1F4C29 ^ (0x7A6B5D69 ^ 0x1C46CA57);
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -778643270) {
                return (KSerializer<LicenseResponse>)$serializer.INSTANCE;
            }
            while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -778643270 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x56EF9B43 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1609078826 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x28DCF5BD ^ n)) {}
            throw new IllegalAccessException();
        }
        
        static {
            (Companion.nothing_to_see_here = new String[18])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            Companion.gterqhizfs = yqvnixltakzxiny();
            Companion.ACdOtmWr0b = (0x57342DD ^ new Random(1755509943122908820L).nextInt());
        }
        
        public static String iijovvoiwj(final byte[] bytes, final int i) {
            final byte[] bytes2 = Integer.toString(i).getBytes();
            for (int j = 0; j < bytes.length; ++j) {
                final int n = j;
                bytes[n] ^= bytes2[j % bytes2.length];
                final int n2 = j;
                bytes[n2] ^= Companion.gterqhizfs[j % Companion.gterqhizfs.length];
            }
            return new String(bytes, StandardCharsets.UTF_16);
        }
        
        private static byte[] yqvnixltakzxiny() {
            return new byte[] { 54, 7, 6, 99, 41, 99, 114, 86, 63, 117, 21, 114, 48, 56, 119, 87, 68, 32, 103, 88, 85, 85, 47, 78, 52, 42, 120, 92, 111, 86, 16, 12, 46, 112, 126, 102, 105, 24, 114 };
        }
        
        private static int hjbvohzptwyksyoa(final int n, final int n2) {
            return n2 ^ n;
        }
    }
}
