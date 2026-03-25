// 
// Decompiled by Procyon v0.6.0
// 

package me.pi3ro.cuy;

import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Random;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import me.pi3ro.cuy.data.LicenseResponse;
import kotlin.Triple;
import org.bukkit.configuration.file.FileConfiguration;
import java.util.Base64;
import me.pi3ro.cuy.utils.ResourceManager;
import me.pi3ro.cuy.security.LicenseValidator;
import me.pi3ro.cuy.security.License;
import java.net.URI;
import me.pi3ro.cuy.security.HWIDUtil;
import java.io.IOException;
import org.bukkit.plugin.Plugin;
import kotlin.jvm.internal.Intrinsics;
import dbjrsyajbkgezbtp.ogwwobatgayyjyld;
import me.pi3ro.cuy.network.ByteClassLoader;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.Metadata;
import org.bukkit.plugin.java.JavaPlugin;

@Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020	H\u0016J$\u0010
                                                   \u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020	H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002
                                                   \u0000¨\u0006\u0013""" }, d2 = { "Lme/pi3ro/cuy/CuyPlugin;", "Lorg/bukkit/plugin/java/JavaPlugin;", "<init>", "()V", "classLoader", "Lme/pi3ro/cuy/network/ByteClassLoader;", "cuyLoader", "Lme/pi3ro/cuy/CuyLoader;", "onEnable", "", "findProduct", "Lkotlin/Triple;", "", "config", "Lorg/bukkit/configuration/file/FileConfiguration;", "isChineseUser", "", "onDisable", "Companion", "cuy-plugin" })
@SourceDebugExtension({ """
                        SMAP
                        CuyPlugin.kt
                        Kotlin
                        *S Kotlin
                        *F
                        + 1 CuyPlugin.kt
                        me/pi3ro/cuy/CuyPlugin
                        + 2 fake.kt
                        kotlin/jvm/internal/FakeKt
                        *L
                        1#1,112:1
                        1#2:113
                        *E
                        """ })
public final class CuyPlugin extends JavaPlugin
{
    @NotNull
    public static final Companion Companion;
    private ByteClassLoader classLoader;
    private CuyLoader cuyLoader;
    public static CuyPlugin INSTANCE;
    private static int VYwNDp8Bs1 = 0;
    private transient int ugxgIrHZdf = 1449048966;
    private static String hjebucdtlh;
    private static String[] nothing_to_see_here;
    
    public CuyPlugin() {
        final int n = 0x1150920 ^ (0x61AE05DC ^ Integer.parseInt("864711397"));
        cvyspgugtyjrdrku(n, 2134999729);
    }
    
    public void onEnable() {
        int n = 0x543C0478 ^ (0x3B541F91 ^ 0x340718E4);
        Label_5096: {
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -612886422) {
                n ^= 0x527EACC3;
                CuyPlugin.Companion.setINSTANCE(this, 606827034);
                Label_5378: {
                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1217232496) {
                        n ^= 0x482143D0;
                        this.saveDefaultConfig();
                        Label_5956: {
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 159867122) {
                                n ^= 0x16AE451D;
                                final FileConfiguration config = this.getConfig();
                                Intrinsics.checkNotNullExpressionValue((Object)config, azeemuwjgf(uhkwylfihhvvwew(), n));
                                final Triple product = this.findProduct(config, 425564095);
                                Label_5483: {
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1124775910) {
                                        n ^= 0x46F638D1;
                                        Label_5619: {
                                            if (product == null) {
                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1958441328) {
                                                    final int n2 = 0x62C1EBF6 ^ n;
                                                    this.getLogger().severe(azeemuwjgf(jbprjmoozayleqd(), n2));
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1655975645) {
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1655975645 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x5FD5293C ^ n2)) {}
                                                        throw new IllegalAccessException("double");
                                                    }
                                                    n = (0x52AE9171 ^ n2);
                                                    this.getServer().getPluginManager().disablePlugin((Plugin)this);
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 138369705) {
                                                        return;
                                                    }
                                                    break Label_5483;
                                                }
                                            }
                                            else {
                                                n ^= 0x764C2D2;
                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1335715840) {
                                                    int n3 = cvyspgugtyjrdrku(n, 641512);
                                                    String s = null;
                                                    int n4;
                                                    String str;
                                                    String hwid;
                                                    URI uri;
                                                    String s2;
                                                    String s3;
                                                    String s4;
                                                    int n5;
                                                    String s5;
                                                    License license;
                                                    LicenseValidator licenseValidator;
                                                    ResourceManager resourceManager;
                                                    LicenseResponse response;
                                                    String plugin_data;
                                                    String src;
                                                    byte b;
                                                    byte[] decode;
                                                    byte[] array;
                                                    ClassLoader classLoader;
                                                    LicenseResponse response2;
                                                    String main_class;
                                                    String s6;
                                                    ByteClassLoader classLoader2;
                                                    Class loadClassPublic;
                                                    Class<? extends CuyLoader> subclass;
                                                    CuyLoader instance;
                                                    CuyLoader cuyLoader;
                                                    CuyLoader cuyLoader2;
                                                    int n6 = 0;
                                                    Exception ex4;
                                                    int n7;
                                                    int n8;
                                                    Label_4690:Label_4732_Outer:
                                                    while (true) {
                                                        Label_4732:Label_4847_Outer:
                                                        while (true) {
                                                        Label_4847:
                                                            while (true) {
                                                                Block_179_Outer:Block_161_Outer:
                                                                while (true) {
                                                                    Label_3530: {
                                                                        while (true) {
                                                                            Label_0782: {
                                                                                Label_0669: {
                                                                                    if ((this.isChineseUser(899895453) ? 1 : 0) == (0x16059AE8 ^ n3)) {
                                                                                        break Label_0669;
                                                                                    }
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -1339238592) {
                                                                                        break Label_4732;
                                                                                    }
                                                                                    n = (0x5A7C53E7 ^ n3);
                                                                                    s = azeemuwjgf(orvrvcpmpojhlyb(), n);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1674463354) {
                                                                                        n4 = (0x3B0801F7 ^ n);
                                                                                        try {
                                                                                            if (ogwwobatgayyjyld.yphcfoidvruxcacx(n4) != 124518929) {
                                                                                                throw null;
                                                                                            }
                                                                                            throw new IOException();
                                                                                        }
                                                                                        catch (final IOException ex) {
                                                                                            switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n4)) {
                                                                                                default: {
                                                                                                    throw new IOException("Error in hash");
                                                                                                }
                                                                                                case -1148303421: {
                                                                                                    n = cvyspgugtyjrdrku(n4, 787349224);
                                                                                                    break;
                                                                                                }
                                                                                                case 2135458219: {
                                                                                                    n = cvyspgugtyjrdrku(n4, 913647141);
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -857624446) {
                                                                                            Label_0620:
                                                                                                while (true) {
                                                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                                        case 967070550: {
                                                                                                            continue Label_4732_Outer;
                                                                                                        }
                                                                                                        case 228520227: {
                                                                                                            break Label_0620;
                                                                                                        }
                                                                                                        case 1160000866: {
                                                                                                            break Label_0782;
                                                                                                        }
                                                                                                        default: {
                                                                                                            break Label_4732;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                n ^= 0x21602A79;
                                                                                                break Label_0782;
                                                                                            }
                                                                                            break Label_5619;
                                                                                        }
                                                                                        break Label_0669;
                                                                                    }
                                                                                    break Label_4732;
                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 732176978 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x69AD30FA ^ n)) {}
                                                                                    throw new RuntimeException("double");
                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -465316015 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x68E41558 ^ n)) {}
                                                                                    throw new RuntimeException("double");
                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 733362720 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0xE6CF359 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1222185939 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x52DB174 ^ n)) {}
                                                                                    throw new IOException("double");
                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1969521926 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x3BD77F0 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 909153091 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x2E28F937 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 563723323 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6A6EC362 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 44339411 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x72E464D3 ^ n)) {}
                                                                                    throw new IllegalAccessException("double");
                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1087234576 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4AB658F ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 581472498 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6A372A21 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 191036513 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x2A64F941 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1728519894 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x31ADB00F ^ n)) {}
                                                                                    throw new IOException("double");
                                                                                }
                                                                                n = cvyspgugtyjrdrku(n3, 888136845);
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 391377705) {
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 391377705) {
                                                                                        n = cvyspgugtyjrdrku(n, 1982627168);
                                                                                    }
                                                                                    break Label_5096;
                                                                                }
                                                                                else {
                                                                                    Label_0755: {
                                                                                    Label_0748:
                                                                                        while (true) {
                                                                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                                case 1289511789: {
                                                                                                    continue Label_4732_Outer;
                                                                                                }
                                                                                                case 61240841: {
                                                                                                    break Label_0748;
                                                                                                }
                                                                                                case 2100656414: {
                                                                                                    break Label_0755;
                                                                                                }
                                                                                                default: {
                                                                                                    break Label_5619;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        n ^= 0x4BF15C1F;
                                                                                    }
                                                                                    s = azeemuwjgf(hxxbybvvwggzwwt(), n);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1222185939) {
                                                                                        continue Label_4847_Outer;
                                                                                    }
                                                                                    n ^= 0x11E73E13;
                                                                                }
                                                                            }
                                                                            str = s;
                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -941563061) {
                                                                                break Label_5096;
                                                                            }
                                                                            n ^= 0x13F07746;
                                                                            hwid = HWIDUtil.INSTANCE.getHWID(2054146007);
                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1482905979) {
                                                                                break Label_3530;
                                                                            }
                                                                            n ^= 0x4DF1574F;
                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 938074881) {
                                                                                break Label_5956;
                                                                            }
                                                                            n ^= 0x32B9E6E5;
                                                                            uri = new URI(str);
                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1574513624) {
                                                                                break Label_5956;
                                                                            }
                                                                            n ^= 0x5903C98E;
                                                                            s2 = (String)product.getSecond();
                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1782093914) {
                                                                                break Label_5378;
                                                                            }
                                                                            n ^= 0x4831D44F;
                                                                            s3 = (String)product.getFirst();
                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 733362720) {
                                                                                continue Label_4847_Outer;
                                                                            }
                                                                            break;
                                                                        }
                                                                        n ^= 0x4123D55A;
                                                                        s4 = (String)product.getThird();
                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 581472498) {
                                                                            continue;
                                                                        }
                                                                        n5 = (0x597FDAB5 ^ n);
                                                                        s5 = hwid;
                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n5) != -380222120) {
                                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n5) != -380222120 || ogwwobatgayyjyld.widdxeioafyswjhq(n5) != (0x2ADE98B9 ^ n5)) {}
                                                                            throw new IllegalAccessException("double");
                                                                        }
                                                                        n = (0x57AFDB45 ^ n5);
                                                                        license = new License(uri, s2, s3, s4, s5);
                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1411948402) {
                                                                            break Label_5096;
                                                                        }
                                                                        n ^= 0x5AEEECC3;
                                                                        licenseValidator = new LicenseValidator();
                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -2090862232) {
                                                                            break Label_5619;
                                                                        }
                                                                        n ^= 0x4374E308;
                                                                        Label_2915: {
                                                                            if ((licenseValidator.validate(license, (String)product.getSecond(), hwid, 128365810) ? 1 : 0) == (0x531F1C25 ^ n)) {
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1728519894) {
                                                                                    continue;
                                                                                }
                                                                                n ^= 0x35D90E4D;
                                                                                this.getServer().getPluginManager().disablePlugin((Plugin)this);
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 909153091) {
                                                                                    return;
                                                                                }
                                                                                continue Label_4847;
                                                                            }
                                                                            else {
                                                                                Label_1300: {
                                                                                Label_1292:
                                                                                    while (true) {
                                                                                        switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                            case 1217940073: {
                                                                                                continue Label_4732_Outer;
                                                                                            }
                                                                                            case 17569176: {
                                                                                                break Label_1292;
                                                                                            }
                                                                                            case 1803755642: {
                                                                                                break Label_1300;
                                                                                            }
                                                                                            default: {
                                                                                                continue Label_4732;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n ^= 0x2427FF2A;
                                                                                }
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1178134405) {
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1178134405) {
                                                                                    Label_1368:
                                                                                        while (true) {
                                                                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                                case 221170122: {
                                                                                                    continue Label_4732_Outer;
                                                                                                }
                                                                                                case 117326037: {
                                                                                                    break Label_1368;
                                                                                                }
                                                                                                case 2027307759: {
                                                                                                    break Label_5096;
                                                                                                }
                                                                                                default: {
                                                                                                    break Label_5483;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        n ^= 0x23FEE00A;
                                                                                        break Label_5096;
                                                                                    }
                                                                                    break Label_2915;
                                                                                }
                                                                                else {
                                                                                    n ^= 0x602D3ECD;
                                                                                    resourceManager = new ResourceManager(this, 1539064186);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1196495344) {
                                                                                        break Label_5619;
                                                                                    }
                                                                                    n ^= 0x52615988;
                                                                                    resourceManager.copyResources((String)product.getFirst(), 805544487);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 732176978) {
                                                                                        continue Label_4690;
                                                                                    }
                                                                                    n ^= 0x17AEE0F2;
                                                                                    response = license.getResponse();
                                                                                    if (response == null) {
                                                                                        break Label_2915;
                                                                                    }
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1764547134) {
                                                                                        break Label_4732;
                                                                                    }
                                                                                    n ^= 0x17584508;
                                                                                    plugin_data = response.getPlugin_data();
                                                                                    if (plugin_data == null) {
                                                                                        break Label_2915;
                                                                                    }
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 739315074) {
                                                                                        break Label_2915;
                                                                                    }
                                                                                    n ^= 0x35E8771;
                                                                                    src = plugin_data;
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 920991242) {
                                                                                        break Label_2915;
                                                                                    }
                                                                                    n ^= 0x646B4239;
                                                                                    b = (byte)(0x22B7E4F8 ^ n);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 364849089) {
                                                                                        break Label_5956;
                                                                                    }
                                                                                }
                                                                            }
                                                                            n ^= 0x3E6F51EE;
                                                                            Label_4460: {
                                                                                try {
                                                                                    n ^= 0x6B88CEFB;
                                                                                    decode = Base64.getDecoder().decode(src);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1165762709) {
                                                                                        n ^= 0x3E20546D;
                                                                                        Intrinsics.checkNotNull((Object)decode);
                                                                                        array = decode;
                                                                                        classLoader = CuyPlugin.class.getClassLoader();
                                                                                        Intrinsics.checkNotNullExpressionValue((Object)classLoader, azeemuwjgf(mykrbijhxknbhff(), n));
                                                                                        this.classLoader = new ByteClassLoader(array, classLoader, 1001687192);
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1266777090) {
                                                                                            n ^= 0x4BA0B23F;
                                                                                            response2 = license.getResponse();
                                                                                            if (response2 != null) {
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 377810424) {
                                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 377810424 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x1F455E84 ^ n)) {}
                                                                                                    throw new IOException("double");
                                                                                                }
                                                                                                n ^= 0x47E53B8B;
                                                                                                main_class = response2.getMain_class();
                                                                                                if (main_class == null) {
                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 699216290) {
                                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 699216290 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6F7338D8 ^ n)) {}
                                                                                                        throw new RuntimeException("double");
                                                                                                    }
                                                                                                    n ^= 0x34A043C8;
                                                                                                }
                                                                                                else {
                                                                                                    n = cvyspgugtyjrdrku(n, 1683618232);
                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 191036513) {
                                                                                                    Label_1814:
                                                                                                        while (true) {
                                                                                                            Label_2432: {
                                                                                                                while (true) {
                                                                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                                                        case 1630281203: {
                                                                                                                            break Label_1814;
                                                                                                                        }
                                                                                                                        case 1245606243: {
                                                                                                                            continue Label_4732_Outer;
                                                                                                                        }
                                                                                                                        case 12703859: {
                                                                                                                            break Label_2432;
                                                                                                                        }
                                                                                                                        default: {
                                                                                                                            break Label_2915;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1178134405 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x57AB4501 ^ n)) {}
                                                                                                                throw new RuntimeException("double");
                                                                                                                s6 = main_class;
                                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1604184138) {
                                                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1604184138 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4A9E82D0 ^ n)) {}
                                                                                                                    throw new IllegalAccessException("double");
                                                                                                                }
                                                                                                                n ^= 0x35F6E514;
                                                                                                                classLoader2 = this.classLoader;
                                                                                                                if (classLoader2 == null) {
                                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -265633557) {
                                                                                                                        break Label_5096;
                                                                                                                    }
                                                                                                                    n ^= 0x16ADFBD5;
                                                                                                                    Intrinsics.throwUninitializedPropertyAccessException(azeemuwjgf(lctumdcwtbinkvg(), n));
                                                                                                                    classLoader2 = null;
                                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1162157635) {
                                                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1162157635 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x5A3AD187 ^ n)) {}
                                                                                                                        throw new IOException("double");
                                                                                                                    }
                                                                                                                    n ^= 0x1782B9F;
                                                                                                                }
                                                                                                                else {
                                                                                                                    Label_2220: {
                                                                                                                        Label_2212: {
                                                                                                                            while (true) {
                                                                                                                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                                                                    case 918397848: {
                                                                                                                                        continue Label_4732_Outer;
                                                                                                                                    }
                                                                                                                                    case 69870781: {
                                                                                                                                        break Label_2212;
                                                                                                                                    }
                                                                                                                                    case 695489360: {
                                                                                                                                        break Label_2220;
                                                                                                                                    }
                                                                                                                                    default: {
                                                                                                                                        break Label_2915;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 920991242 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0xD424BAC ^ n)) {}
                                                                                                                            throw new RuntimeException("double");
                                                                                                                        }
                                                                                                                        n ^= 0x327BA9B;
                                                                                                                    }
                                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -384363469) {
                                                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -384363469) {
                                                                                                                        Label_3004:
                                                                                                                            while (true) {
                                                                                                                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                                                                    case 845882651: {
                                                                                                                                        continue Label_4732_Outer;
                                                                                                                                    }
                                                                                                                                    case 41151425: {
                                                                                                                                        break Label_3004;
                                                                                                                                    }
                                                                                                                                    default: {
                                                                                                                                        continue Label_4690;
                                                                                                                                    }
                                                                                                                                    case 16988099: {
                                                                                                                                        break Label_5096;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            n ^= 0x29E4E183;
                                                                                                                            break Label_5096;
                                                                                                                        }
                                                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -384363469 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x331C9745 ^ n)) {}
                                                                                                                        throw new IOException("double");
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        n ^= 0x14F26AD1;
                                                                                                                    }
                                                                                                                }
                                                                                                                loadClassPublic = classLoader2.loadClassPublic(s6, 505476532);
                                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1317290683) {
                                                                                                                    break Label_5096;
                                                                                                                }
                                                                                                                n ^= 0x7313A604;
                                                                                                                subclass = loadClassPublic.asSubclass(CuyLoader.class);
                                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -702975336) {
                                                                                                                    break Label_5956;
                                                                                                                }
                                                                                                                n ^= 0x52E1A51;
                                                                                                                instance = (CuyLoader)subclass.newInstance();
                                                                                                                Intrinsics.checkNotNullExpressionValue((Object)instance, azeemuwjgf(dhxnlzqtlvmhxeb(), n));
                                                                                                                cuyLoader = instance;
                                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -9854960) {
                                                                                                                    break Label_5483;
                                                                                                                }
                                                                                                                n ^= 0x27E8E110;
                                                                                                                this.cuyLoader = cuyLoader;
                                                                                                                Label_3378: {
                                                                                                                    Block_143: {
                                                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1070684015) {
                                                                                                                            n ^= 0x7CEF0E61;
                                                                                                                            cuyLoader2 = this.cuyLoader;
                                                                                                                            Label_2126: {
                                                                                                                                if (cuyLoader2 == null) {
                                                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 660003738) {
                                                                                                                                        break Label_4732;
                                                                                                                                    }
                                                                                                                                    n ^= 0x20D9ECF4;
                                                                                                                                    Intrinsics.throwUninitializedPropertyAccessException(azeemuwjgf(kqcmuedfmiegozc(), n));
                                                                                                                                    cuyLoader2 = null;
                                                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 563723323) {
                                                                                                                                        continue Label_4847;
                                                                                                                                    }
                                                                                                                                    n ^= 0x420ACA18;
                                                                                                                                }
                                                                                                                                else {
                                                                                                                                    n = cvyspgugtyjrdrku(n, 364491820);
                                                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1969521926) {
                                                                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1969521926) {
                                                                                                                                            n ^= 0x5956C5A;
                                                                                                                                            break Label_5096;
                                                                                                                                        }
                                                                                                                                        continue Label_4847;
                                                                                                                                    }
                                                                                                                                    else {
                                                                                                                                    Label_2340:
                                                                                                                                        while (true) {
                                                                                                                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                                                                                case 987276350: {
                                                                                                                                                    break Label_2126;
                                                                                                                                                }
                                                                                                                                                case 1107581036: {
                                                                                                                                                    continue Label_4732_Outer;
                                                                                                                                                }
                                                                                                                                                case 227669659: {
                                                                                                                                                    break Label_2340;
                                                                                                                                                }
                                                                                                                                                default: {
                                                                                                                                                    continue Label_4847;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        n ^= 0x776A92C0;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            cuyLoader2.onEnable();
                                                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 835710201) {
                                                                                                                                n ^= 0x1025DBFC;
                                                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1327418599) {
                                                                                                                                    break Block_143;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        Label_3177:
                                                                                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 835710201 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x77F76397 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1327418599 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7289AC34 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1477255502 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x42C9F067 ^ n)) {}
                                                                                                                            throw new IOException("double");
                                                                                                                        }
                                                                                                                        break Label_3378;
                                                                                                                    }
                                                                                                                    n = cvyspgugtyjrdrku(n, 2008872093);
                                                                                                                    try {
                                                                                                                        if (ogwwobatgayyjyld.yphcfoidvruxcacx(n) != 254269804) {
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        throw new IOException();
                                                                                                                        iftrue(Label_3378:)(ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1955290394 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x309B394D ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1070684015 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7225173C ^ n));
                                                                                                                    }
                                                                                                                    catch (final IOException ex2) {
                                                                                                                        switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n)) {
                                                                                                                            default: {
                                                                                                                                throw new IOException("Error in hash");
                                                                                                                            }
                                                                                                                            case 218535922: {
                                                                                                                                n ^= 0x70D95F8D;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            case 1955290394: {
                                                                                                                                n = cvyspgugtyjrdrku(n, 2145969872);
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1949537383) {
                                                                                                                        Label_3652:
                                                                                                                            while (true) {
                                                                                                                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                                                                    case 1533017075: {
                                                                                                                                        continue Label_4732_Outer;
                                                                                                                                    }
                                                                                                                                    case 266056567: {
                                                                                                                                        break Label_3652;
                                                                                                                                    }
                                                                                                                                    case 2032656979: {
                                                                                                                                        break Label_4460;
                                                                                                                                    }
                                                                                                                                    default: {
                                                                                                                                        break Label_5956;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            n ^= 0x3D46919D;
                                                                                                                            break Label_4460;
                                                                                                                        }
                                                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1949537383 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x58A0FD1B ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1482905979 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x724146BA ^ n)) {}
                                                                                                                        throw new IllegalAccessException("double");
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            n ^= 0x6A9FE285;
                                                                                                            continue Label_1814;
                                                                                                        }
                                                                                                    }
                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 191036513) {
                                                                                                        n ^= 0x75AA5C89;
                                                                                                        break Label_5096;
                                                                                                    }
                                                                                                    continue Block_179_Outer;
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                n ^= 0x21E68653;
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 431021921) {
                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 431021921) {
                                                                                                        n ^= 0x77F018E9;
                                                                                                        break Label_5096;
                                                                                                    }
                                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 431021921 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x42BD984D ^ n)) {}
                                                                                                    throw new IllegalAccessException("double");
                                                                                                }
                                                                                                else {
                                                                                                    n ^= 0x52A3FE10;
                                                                                                }
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        break Label_5378;
                                                                                    }
                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 660003738 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x52920EC3 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1165762709 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x64E53266 ^ n)) {}
                                                                                    throw new IOException("double");
                                                                                    while (true) {
                                                                                    Block_160:
                                                                                        while (true) {
                                                                                            n ^= 0x3858D3;
                                                                                            break Label_5096;
                                                                                            iftrue(Label_2571:)(ogwwobatgayyjyld.widdxeioafyswjhq(n) != 739315074 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x697C6336 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1641565377 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x241FB1AC ^ n));
                                                                                            throw new RuntimeException("double");
                                                                                            Label_3164: {
                                                                                                n = cvyspgugtyjrdrku(n, 883608012);
                                                                                            }
                                                                                            break Label_4460;
                                                                                            n = cvyspgugtyjrdrku(n, 293370470);
                                                                                            iftrue(Label_3164:)(ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1477255502);
                                                                                            Block_178: {
                                                                                                break Block_178;
                                                                                                n ^= 0x4A28C138;
                                                                                                break Label_5096;
                                                                                                n = cvyspgugtyjrdrku(n, 1278518917);
                                                                                                iftrue(Label_2680:)(ogwwobatgayyjyld.widdxeioafyswjhq(n) == -143257112);
                                                                                                break Block_160;
                                                                                            }
                                                                                            iftrue(Label_3177:)(ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1477255502);
                                                                                            continue Block_161_Outer;
                                                                                        }
                                                                                        iftrue(Label_5483:)(ogwwobatgayyjyld.widdxeioafyswjhq(n) != -143257112);
                                                                                        continue;
                                                                                    }
                                                                                    Label_2680: {
                                                                                        n = cvyspgugtyjrdrku(n, 2126139431);
                                                                                    }
                                                                                    break Label_4460;
                                                                                }
                                                                                catch (final Exception ex3) {
                                                                                    switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n)) {
                                                                                        case -1070684015: {
                                                                                            n6 = (0x42AE2AEF ^ n);
                                                                                            break;
                                                                                        }
                                                                                        case 1162157635: {
                                                                                            n6 = (0x12035C35 ^ n);
                                                                                            break;
                                                                                        }
                                                                                        default: {
                                                                                            throw new IOException("Error in hash");
                                                                                        }
                                                                                        case 563723323: {
                                                                                            n6 = cvyspgugtyjrdrku(n, 513329274);
                                                                                            break;
                                                                                        }
                                                                                        case 1317290683: {
                                                                                            n6 = (0x137B77AA ^ n);
                                                                                            break;
                                                                                        }
                                                                                        case 1604184138: {
                                                                                            n6 = cvyspgugtyjrdrku(n, 827867892);
                                                                                            break;
                                                                                        }
                                                                                        case -1165762709: {
                                                                                            n6 = cvyspgugtyjrdrku(n, 234587152);
                                                                                            break;
                                                                                        }
                                                                                        case 377810424: {
                                                                                            n6 = (0x787B6242 ^ n);
                                                                                            break;
                                                                                        }
                                                                                        case -423253840: {
                                                                                            n6 = (0x66734AEB ^ n);
                                                                                            break;
                                                                                        }
                                                                                        case 1266777090: {
                                                                                            n6 = cvyspgugtyjrdrku(n, 870043773);
                                                                                            break;
                                                                                        }
                                                                                        case 660003738: {
                                                                                            n6 = (0x3E41248E ^ n);
                                                                                            break;
                                                                                        }
                                                                                        case -702975336: {
                                                                                            n6 = cvyspgugtyjrdrku(n, 1617482158);
                                                                                            break;
                                                                                        }
                                                                                        case -9854960: {
                                                                                            n6 = (0x6546CBFF ^ n);
                                                                                            break;
                                                                                        }
                                                                                        case 835710201: {
                                                                                            n6 = cvyspgugtyjrdrku(n, 1553072738);
                                                                                            break;
                                                                                        }
                                                                                        case -265633557: {
                                                                                            n6 = (0x4AEA7E0 ^ n);
                                                                                            break;
                                                                                        }
                                                                                        case -1934675997: {
                                                                                            n6 = (0xB3E1A01 ^ n);
                                                                                            break;
                                                                                        }
                                                                                        case 699216290: {
                                                                                            n6 = (0x3F9E59C9 ^ n);
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    ex4 = ex3;
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n6) != -715128853) {
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n6) != -715128853 || ogwwobatgayyjyld.widdxeioafyswjhq(n6) != (0x1F63523C ^ n6)) {}
                                                                                        throw new RuntimeException("double");
                                                                                    }
                                                                                    n7 = (0x15EF92F1 ^ n6);
                                                                                    this.getLogger().severe("Failed to load plugin: " + ex4.getMessage());
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n7) != 2049140835) {
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n7) != 2049140835 || ogwwobatgayyjyld.widdxeioafyswjhq(n7) != (0x2F1201B5 ^ n7)) {}
                                                                                        throw new IllegalAccessException("double");
                                                                                    }
                                                                                    n = (0x5CEF5403 ^ n7);
                                                                                    this.getServer().getPluginManager().disablePlugin((Plugin)this);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1655060359) {
                                                                                        break Label_5619;
                                                                                    }
                                                                                    n ^= 0x3F9425E1;
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1643702128) {
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1674463354 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x9F5761E ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1643702128 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x193ADEDA ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1764547134 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x492AAD28 ^ n)) {}
                                                                                        throw new IllegalAccessException("double");
                                                                                    }
                                                                                    n8 = (0x316C3F0D ^ n);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n8) == -359063783) {
                                                                                        n3 = cvyspgugtyjrdrku(n8, 1346212358);
                                                                                        try {
                                                                                            if (ogwwobatgayyjyld.yphcfoidvruxcacx(n3) != 67507653) {
                                                                                                throw null;
                                                                                            }
                                                                                            throw new IOException();
                                                                                            iftrue(Label_4311:)(ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -1339238592 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x327E97F2 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 1802866475 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x374A293B ^ n3));
                                                                                            throw new RuntimeException("double");
                                                                                        }
                                                                                        catch (final IOException ex5) {
                                                                                            switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n3)) {
                                                                                                case 1802866475: {
                                                                                                    n = cvyspgugtyjrdrku(n3, 1374079759);
                                                                                                    break;
                                                                                                }
                                                                                                case 1464514553: {
                                                                                                    n = (0x16612C15 ^ n3);
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    throw new IllegalAccessException("Error in hash");
                                                                                                }
                                                                                            }
                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -465316015) {
                                                                                                return;
                                                                                            }
                                                                                            continue Label_4732;
                                                                                        }
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 44339411) {
                                                                                            continue Label_4847;
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n8) != -359063783 || ogwwobatgayyjyld.widdxeioafyswjhq(n8) != (0x7F1512C7 ^ n8)) {}
                                                                                    throw new RuntimeException("double");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        continue Label_4690;
                                                    }
                                                }
                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1335715840) {
                                                Label_5088:
                                                    while (true) {
                                                        switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                            case 163378630: {
                                                                continue;
                                                            }
                                                            case 179828444: {
                                                                break Label_5088;
                                                            }
                                                            case 872714447: {
                                                                break Label_5096;
                                                            }
                                                            default: {
                                                                break Label_5378;
                                                            }
                                                        }
                                                    }
                                                    n ^= 0x42CA5005;
                                                    break Label_5096;
                                                }
                                                break Label_5956;
                                            }
                                        }
                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -2090862232 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x31F04922 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -857624446 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x230ADEF5 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1544085321 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4FC2FF00 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1655060359 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6494BA9E ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1196495344 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4D588C82 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1958441328 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x40FF0425 ^ n)) {}
                                        throw new RuntimeException("double");
                                    }
                                }
                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 138369705 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x49B2C72F ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1124775910 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x2E58CC30 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -9854960 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x55D170F3 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -143257112 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x76810612 ^ n)) {}
                                throw new RuntimeException("double");
                            }
                        }
                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 159867122 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6C6A4C47 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1574513624 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x66B01575 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -702975336 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x348F97A1 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 364849089 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x42A12200 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1335715840 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x59B1F18E ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 938074881 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x187609A3 ^ n)) {}
                        throw new IOException("double");
                    }
                }
                while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1782093914 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x447651F6 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1217232496 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x3CCB0773 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1266777090 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x452BB5C2 ^ n)) {}
                throw new IllegalAccessException("double");
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1317290683 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x796E7D49 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -941563061 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7AB9EB71 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1411948402 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6ACA6609 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1464514553 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x2EE0A86C ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -612886422 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x512D0282 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 391377705 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7E790231 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -265633557 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6F597BD1 ^ n)) {}
        throw new IllegalAccessException();
    }
    
    private final Triple<String, String, String> findProduct(final FileConfiguration fileConfiguration, final FileConfiguration fileConfiguration2) {
        final int n = 0x4560055E ^ (0x4A39A73D ^ 0x340718E4);
        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -621423559) {
            int n2 = 0x2E97C3A0 ^ n;
            final String[] array = new String[(byte)(0x15C97923 ^ n2)];
            array[(byte)(0x15C97927 ^ n2)] = azeemuwjgf(fflmipvhuvaxrcg(), n2);
            array[(byte)(0x15C97926 ^ n2)] = azeemuwjgf(cdfjcnlsganqsoo(), n2);
            array[(byte)(0x15C97925 ^ n2)] = azeemuwjgf(gdjkywwzthyaxgt(), n2);
            array[(byte)(0x15C97924 ^ n2)] = azeemuwjgf(nmqdtzyccqklqyk(), n2);
            final List list = CollectionsKt.listOf((Object[])array);
            Label_4410: {
                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1370765000) {
                    final int n3 = 0x42892F48 ^ n2;
                    final Iterator iterator = list.iterator();
                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -1174228102) {
                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -1174228102 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x61CDA991 ^ n3)) {}
                        throw new RuntimeException("double");
                    }
                    int n4 = 0x6D82D97E ^ n3;
                    int cvyspgugtyjrdrku = 0;
                Label_3513:
                    while (true) {
                    Label_4789_Outer:
                        while ((iterator.hasNext() ? 1 : 0) != (0x3AC28F11 ^ n4)) {
                            Label_4127: {
                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) == -703301495) {
                                    final int n5 = 0xC02B990 ^ n4;
                                    final String s = (String)iterator.next();
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n5) != -1241402359) {
                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n5) != -1241402359 || ogwwobatgayyjyld.widdxeioafyswjhq(n5) != (0x4FC40A1C ^ n5)) {}
                                        throw new IOException("double");
                                    }
                                    final int n6 = 0x302F9274 ^ n5;
                                    final String string = fileConfiguration.getString(s + ".LICENSE");
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n6) != 930949032) {
                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n6) != 930949032 || ogwwobatgayyjyld.widdxeioafyswjhq(n6) != (0x2AAA9400 ^ n6)) {}
                                        throw new IllegalAccessException("double");
                                    }
                                    n2 = (0x54196E87 ^ n6);
                                    final String string2 = fileConfiguration.getString(s + ".VERSION");
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1749658734) {
                                        break Label_4410;
                                    }
                                    n2 ^= 0x7DEACAA5;
                                    final CharSequence charSequence = string;
                                Label_3397:
                                    while (true) {
                                        String string3 = null;
                                    Label_3213:
                                        while (true) {
                                        Label_4789:
                                            while (true) {
                                            Label_4085:
                                                while (true) {
                                                    Label_3008: {
                                                    Label_1689:
                                                        while (true) {
                                                        Label_4567:
                                                            while (true) {
                                                            Label_3809:
                                                                while (true) {
                                                                Label_3703:
                                                                    while (true) {
                                                                    Label_3947:
                                                                        while (true) {
                                                                            byte b = 0;
                                                                            Label_1175: {
                                                                                Label_1147: {
                                                                                    Label_0507: {
                                                                                        if (charSequence != null) {
                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 2027947705) {
                                                                                                break Label_4789;
                                                                                            }
                                                                                            n2 ^= 0x76AE2089;
                                                                                            if (charSequence.length() == (0x59B2205E ^ n2)) {
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -846134542) {
                                                                                                    n2 ^= 0x5105697B;
                                                                                                    break Label_0507;
                                                                                                }
                                                                                                break Label_4085;
                                                                                            }
                                                                                            else {
                                                                                                n2 ^= 0xF91DDE2;
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1323307550) {
                                                                                                Label_0612:
                                                                                                    while (true) {
                                                                                                        switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                                                            case 694593614: {
                                                                                                                continue Label_4789_Outer;
                                                                                                            }
                                                                                                            case 115731903: {
                                                                                                                break Label_0612;
                                                                                                            }
                                                                                                            case 1665057033: {
                                                                                                                break Label_1147;
                                                                                                            }
                                                                                                            default: {
                                                                                                                break Label_1689;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    n2 ^= 0x131A95E9;
                                                                                                    break Label_1147;
                                                                                                }
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1323307550) {
                                                                                                    n2 = cvyspgugtyjrdrku(n2, 884360034);
                                                                                                    break Label_4410;
                                                                                                }
                                                                                                break Label_4789;
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Label_4364: {
                                                                                            Label_4356:
                                                                                                while (true) {
                                                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                                                        case 131512001: {
                                                                                                            continue Label_4789_Outer;
                                                                                                        }
                                                                                                        case 189165244: {
                                                                                                            break Label_4356;
                                                                                                        }
                                                                                                        case 1258396536: {
                                                                                                            break Label_4364;
                                                                                                        }
                                                                                                        default: {
                                                                                                            break Label_4789;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                n2 ^= 0x7059BD39;
                                                                                            }
                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -97652878) {
                                                                                                n2 = cvyspgugtyjrdrku(n2, 1475540171);
                                                                                                break Label_0507;
                                                                                            }
                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -97652878) {
                                                                                                n2 ^= 0x3DD00330;
                                                                                                break Label_4410;
                                                                                            }
                                                                                            break Label_4567;
                                                                                        }
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1841932749 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0xB4D9EF ^ n2)) {}
                                                                                        throw new RuntimeException("double");
                                                                                    Label_3471:
                                                                                        while (true) {
                                                                                            Label_3268: {
                                                                                                Label_3260: {
                                                                                                    while (true) {
                                                                                                        switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                                                            case 138576515: {
                                                                                                                continue Label_4789_Outer;
                                                                                                            }
                                                                                                            case 14127236: {
                                                                                                                break Label_3260;
                                                                                                            }
                                                                                                            case 1512414933: {
                                                                                                                break Label_3268;
                                                                                                            }
                                                                                                            default: {
                                                                                                                break Label_3471;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -2108009893 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x18057C82 ^ n2)) {}
                                                                                                    throw new IOException("double");
                                                                                                }
                                                                                                n2 ^= 0x1C23B726;
                                                                                            }
                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 57603243) {
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 57603243) {
                                                                                                    n2 ^= 0x2F8604B;
                                                                                                    break Label_4410;
                                                                                                }
                                                                                                break Label_3809;
                                                                                            }
                                                                                            else {
                                                                                                n2 ^= 0x102694DE;
                                                                                                final String s2;
                                                                                                string3 = s2;
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -2108009893) {
                                                                                                    n2 ^= 0xFDA88AA;
                                                                                                    break Label_3213;
                                                                                                }
                                                                                                continue Label_3471;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -414395999 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x3872421D ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -57796853 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x38FF1E27 ^ n2)) {}
                                                                                        throw new RuntimeException("double");
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 159378874 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x4CCB050F ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1914151032 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x267A0D88 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1996898681 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x43DD76EF ^ n2)) {}
                                                                                        throw new RuntimeException("double");
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1841302277 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x517ACF05 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1543167451 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0xF6C676C ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -495759973 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x1FC35318 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 57603243 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x3D7A8975 ^ n2)) {}
                                                                                        throw new IllegalAccessException("double");
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -2139850957 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x751F5714 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 615427488 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x4519105F ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 2106175034 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x79DFAAB9 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1169836328 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x1B08EEF5 ^ n2)) {}
                                                                                        throw new RuntimeException("double");
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -846134542 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x5B26A65A ^ n2)) {}
                                                                                        throw new RuntimeException("double");
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -689541357 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x21D72349 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -97652878 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x220EF519 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1670731976 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x6ED3E813 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1139362134 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x24254C8B ^ n2)) {}
                                                                                        throw new IOException("double");
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -392599621 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x72ADBAB5 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 2027947705 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x6BA0A43A ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1703039777 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x26B3F83E ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1323307550 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x5AE68F43 ^ n2)) {}
                                                                                        throw new IllegalAccessException("double");
                                                                                    }
                                                                                    b = (byte)(0x8B74924 ^ n2);
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1169836328) {
                                                                                        continue Label_3947;
                                                                                    }
                                                                                    final int n7 = 0x1277CB6B ^ n2;
                                                                                    try {
                                                                                        if (ogwwobatgayyjyld.yphcfoidvruxcacx(n7) != 64284343) {
                                                                                            throw null;
                                                                                        }
                                                                                        throw new IllegalAccessException();
                                                                                    }
                                                                                    catch (final IllegalAccessException ex) {
                                                                                        switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n7)) {
                                                                                            default: {
                                                                                                throw new IllegalAccessException("Error in hash");
                                                                                            }
                                                                                            case 1543167451: {
                                                                                                n2 = (0x4559B67B ^ n7);
                                                                                                break;
                                                                                            }
                                                                                            case -704376208: {
                                                                                                n2 = cvyspgugtyjrdrku(n7, 887517070);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 1899458049) {
                                                                                        Label_1136:
                                                                                            while (true) {
                                                                                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                                                    case 922714377: {
                                                                                                        continue Label_4789_Outer;
                                                                                                    }
                                                                                                    case 158024322: {
                                                                                                        break Label_1136;
                                                                                                    }
                                                                                                    case 10272279: {
                                                                                                        break Label_1175;
                                                                                                    }
                                                                                                    default: {
                                                                                                        continue Label_3703;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            n2 ^= 0x12CF77F4;
                                                                                            break Label_1175;
                                                                                        }
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1899458049 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x1D3583E1 ^ n2)) {}
                                                                                        throw new IllegalAccessException("double");
                                                                                    }
                                                                                }
                                                                                b = (byte)(0x45396855 ^ n2);
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 701186730) {
                                                                                    break Label_3008;
                                                                                }
                                                                                n2 ^= 0x79D0F261;
                                                                            }
                                                                            if (b == (0x3CE99A34 ^ n2)) {
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -414395999) {
                                                                                    continue Label_3397;
                                                                                }
                                                                                n2 ^= 0x370FD746;
                                                                                final CharSequence charSequence2 = string2;
                                                                            Label_2227:
                                                                                while (true) {
                                                                                    byte b2 = 0;
                                                                                    Label_1903: {
                                                                                        while (true) {
                                                                                            Label_1291: {
                                                                                                if (charSequence2 != null) {
                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1597139856) {
                                                                                                        break Label_2227;
                                                                                                    }
                                                                                                    n2 ^= 0x29D96A8A;
                                                                                                    if (charSequence2.length() == (0x223F27F8 ^ n2)) {
                                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 301547457) {
                                                                                                            n2 ^= 0xE8F6D9C;
                                                                                                            break Label_1291;
                                                                                                        }
                                                                                                        break Label_1636;
                                                                                                    }
                                                                                                    else {
                                                                                                        Label_1788: {
                                                                                                        Label_1780:
                                                                                                            while (true) {
                                                                                                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                                                                    case 492072002: {
                                                                                                                        continue Label_4789_Outer;
                                                                                                                    }
                                                                                                                    case 39485263: {
                                                                                                                        break Label_1780;
                                                                                                                    }
                                                                                                                    case 232471322: {
                                                                                                                        break Label_1788;
                                                                                                                    }
                                                                                                                    default: {
                                                                                                                        continue Label_4567;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            n2 ^= 0x5078D967;
                                                                                                        }
                                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1841302277) {
                                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1841302277) {
                                                                                                            Label_1856:
                                                                                                                while (true) {
                                                                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                                                                        case 374553614: {
                                                                                                                            continue Label_4789_Outer;
                                                                                                                        }
                                                                                                                        case 225120019: {
                                                                                                                            break Label_1856;
                                                                                                                        }
                                                                                                                        default: {
                                                                                                                            continue Label_3947;
                                                                                                                        }
                                                                                                                        case 2049925677: {
                                                                                                                            break Label_4410;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                n2 ^= 0x10D24041;
                                                                                                                break Label_4410;
                                                                                                            }
                                                                                                            continue Label_3809;
                                                                                                        }
                                                                                                        else {
                                                                                                            n2 ^= 0x7E355586;
                                                                                                            b2 = (byte)(0xC72AB19 ^ n2);
                                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 1670731976) {
                                                                                                                n2 ^= 0x43C39EDE;
                                                                                                                break Label_1903;
                                                                                                            }
                                                                                                            continue Label_4567;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Label_1368: {
                                                                                                    Label_1360:
                                                                                                        while (true) {
                                                                                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                                                                case 1008725117: {
                                                                                                                    continue Label_4789_Outer;
                                                                                                                }
                                                                                                                case 118373866: {
                                                                                                                    break Label_1360;
                                                                                                                }
                                                                                                                case 511701100: {
                                                                                                                    break Label_1368;
                                                                                                                }
                                                                                                                default: {
                                                                                                                    continue Label_3809;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        n2 ^= 0x79A087B4;
                                                                                                    }
                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1841932749) {
                                                                                                        n2 ^= 0x5EF680A2;
                                                                                                        break Label_1291;
                                                                                                    }
                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1841932749) {
                                                                                                        n2 ^= 0x10D37418;
                                                                                                        break Label_4410;
                                                                                                    }
                                                                                                    continue Label_1689;
                                                                                                }
                                                                                                while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -508464696 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x378806DB ^ cvyspgugtyjrdrku) || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 1362516585 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0xBE9C108 ^ cvyspgugtyjrdrku) || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 1089966672 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x4718759E ^ cvyspgugtyjrdrku)) {}
                                                                                                throw new IllegalAccessException("double");
                                                                                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 301547457 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x7D3B6D2E ^ n2)) {}
                                                                                                throw new RuntimeException("double");
                                                                                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1597139856 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x58350116 ^ n2)) {}
                                                                                                throw new IllegalAccessException("double");
                                                                                            }
                                                                                            b2 = (byte)(0x2CB04A65 ^ n2);
                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 1703039777) {
                                                                                                final int n8 = 0x55B8D0A6 ^ n2;
                                                                                                try {
                                                                                                    if (ogwwobatgayyjyld.yphcfoidvruxcacx(n8) != 176214751) {
                                                                                                        throw null;
                                                                                                    }
                                                                                                    throw new IOException();
                                                                                                }
                                                                                                catch (final IOException ex2) {
                                                                                                    switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n8)) {
                                                                                                        case 1996898681: {
                                                                                                            cvyspgugtyjrdrku = (0x32D6E616 ^ n8);
                                                                                                            break;
                                                                                                        }
                                                                                                        case -935012845: {
                                                                                                            cvyspgugtyjrdrku = (0x653EB4FB ^ n8);
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            throw new IllegalAccessException("Error in hash");
                                                                                                        }
                                                                                                    }
                                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == -508464696) {
                                                                                                        n2 = cvyspgugtyjrdrku(cvyspgugtyjrdrku, 1401363454);
                                                                                                        break Label_1903;
                                                                                                    }
                                                                                                    continue Label_3513;
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        continue Label_4789;
                                                                                    }
                                                                                    if (b2 == (0x4FB135C7 ^ n2)) {
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 2106175034) {
                                                                                            continue Label_3947;
                                                                                        }
                                                                                        n2 ^= 0x356DF825;
                                                                                        final String lowerCase = s.toLowerCase(Locale.ROOT);
                                                                                        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, azeemuwjgf(hxrcbbszztuqiwz(), n2));
                                                                                        final String s2 = lowerCase;
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -689541357) {
                                                                                            continue Label_4567;
                                                                                        }
                                                                                        n2 ^= 0x62ED4B8A;
                                                                                        byte b3 = 0;
                                                                                        Label_2521: {
                                                                                            if (s2.length() > (0x18318668 ^ n2)) {
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1047776448) {
                                                                                                    break Label_4410;
                                                                                                }
                                                                                                n2 ^= 0x4FB350BD;
                                                                                                b3 = (byte)(0x5782D6D4 ^ n2);
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1139362134) {
                                                                                                    continue Label_4567;
                                                                                                }
                                                                                                Label_2269: {
                                                                                                Label_2216:
                                                                                                    while (true) {
                                                                                                        switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                                                            case 907004103: {
                                                                                                                continue Label_4789_Outer;
                                                                                                            }
                                                                                                            case 160290750: {
                                                                                                                break Label_2216;
                                                                                                            }
                                                                                                            default: {
                                                                                                                continue Label_2227;
                                                                                                            }
                                                                                                            case 616768904: {
                                                                                                                break Label_2269;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    n2 ^= 0x585DF41D;
                                                                                                    try {
                                                                                                        if (ogwwobatgayyjyld.yphcfoidvruxcacx(n2) != 247487676) {
                                                                                                            throw null;
                                                                                                        }
                                                                                                        throw new RuntimeException();
                                                                                                    }
                                                                                                    catch (final RuntimeException ex3) {
                                                                                                        switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n2)) {
                                                                                                            case 2130253376: {
                                                                                                                n2 ^= 0x7FD1AC2E;
                                                                                                                break;
                                                                                                            }
                                                                                                            case -1525772470: {
                                                                                                                n2 ^= 0x24AF5F0F;
                                                                                                                break;
                                                                                                            }
                                                                                                            default: {
                                                                                                                throw new IOException("Error in hash");
                                                                                                            }
                                                                                                        }
                                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -2139850957) {
                                                                                                            n2 = cvyspgugtyjrdrku(n2, 205580117);
                                                                                                            break Label_2521;
                                                                                                        }
                                                                                                        continue Label_3947;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            cvyspgugtyjrdrku = cvyspgugtyjrdrku(n2, 271545378);
                                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 1089966672) {
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == 1089966672) {
                                                                                                    n2 = cvyspgugtyjrdrku(cvyspgugtyjrdrku, 1787514004);
                                                                                                    break Label_4410;
                                                                                                }
                                                                                                continue Label_3513;
                                                                                            }
                                                                                            else {
                                                                                                final int n9 = 0x5CD6A2AB ^ cvyspgugtyjrdrku;
                                                                                                b3 = (byte)(0x54C850E1 ^ n9);
                                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n9) != -1505589494) {
                                                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n9) != -1505589494 || ogwwobatgayyjyld.widdxeioafyswjhq(n9) != (0x5E74B4B4 ^ n9)) {}
                                                                                                    throw new RuntimeException("double");
                                                                                                }
                                                                                                n2 = (0x28863952 ^ n9);
                                                                                            }
                                                                                        }
                                                                                        if (b3 == (0x7C4E69B3 ^ n2)) {
                                                                                            continue Label_3213;
                                                                                        }
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -495759973) {
                                                                                            continue Label_3809;
                                                                                        }
                                                                                        final int n10 = 0x5ECF791 ^ n2;
                                                                                        final StringBuilder sb = new StringBuilder();
                                                                                        final char char1 = s2.charAt((byte)(0x79A29E22 ^ n10));
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n10) != -854265581) {
                                                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n10) != -854265581 || ogwwobatgayyjyld.widdxeioafyswjhq(n10) != (0x76A60FB3 ^ n10)) {}
                                                                                            throw new RuntimeException("double");
                                                                                        }
                                                                                        n4 = (0x2A8B737F ^ n10);
                                                                                        final StringBuilder sb2 = sb;
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -1722848534) {
                                                                                            break Label_4127;
                                                                                        }
                                                                                        final int n11 = 0x35DCDE6 ^ n4;
                                                                                        final byte b4 = (byte)(0x507420BB ^ n11);
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n11) != -2086599206) {
                                                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n11) != -2086599206 || ogwwobatgayyjyld.widdxeioafyswjhq(n11) != (0x5BB9000C ^ n11)) {}
                                                                                            throw new RuntimeException("double");
                                                                                        }
                                                                                        cvyspgugtyjrdrku = (0x7A52EBF6 ^ n11);
                                                                                        final String value = String.valueOf(char1);
                                                                                        Intrinsics.checkNotNull((Object)value, azeemuwjgf(yxqrifupuqygaom(), cvyspgugtyjrdrku));
                                                                                        final String upperCase = value.toUpperCase(Locale.ROOT);
                                                                                        Intrinsics.checkNotNullExpressionValue((Object)upperCase, azeemuwjgf(duhjhalralpbmgw(), cvyspgugtyjrdrku));
                                                                                        final CharSequence obj = upperCase;
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 1362516585) {
                                                                                            continue Label_3513;
                                                                                        }
                                                                                        n2 = (0x4EAEFACE ^ (0x601DE437 ^ cvyspgugtyjrdrku));
                                                                                        final StringBuilder sb3 = sb2;
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 615427488) {
                                                                                            continue Label_3947;
                                                                                        }
                                                                                        n4 = (0x6F2C94C6 ^ n2);
                                                                                        final StringBuilder append = sb3.append((Object)obj);
                                                                                        final String substring = s2.substring((byte)(0x6BB94173 ^ n4));
                                                                                        Intrinsics.checkNotNullExpressionValue((Object)substring, azeemuwjgf(iwdcupsiufcuduo(), n4));
                                                                                        string3 = append.append(substring).toString();
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) != 1573522323) {
                                                                                            break Label_4127;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        final int cvyspgugtyjrdrku2 = cvyspgugtyjrdrku(n2, 568844933);
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku2) == 1924577811) {
                                                                                            n4 = cvyspgugtyjrdrku(cvyspgugtyjrdrku2, 1419008083);
                                                                                            continue Label_4789_Outer;
                                                                                        }
                                                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku2) == 1924577811) {
                                                                                            n2 = cvyspgugtyjrdrku(cvyspgugtyjrdrku2, 214133148);
                                                                                            break Label_4410;
                                                                                        }
                                                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku2) != 1924577811 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku2) != (0x3D63E99A ^ cvyspgugtyjrdrku2)) {}
                                                                                        throw new IOException("double");
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }
                                                                            else {
                                                                                n2 ^= 0x2D5491C5;
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1914151032) {
                                                                                    n4 = cvyspgugtyjrdrku(n2, 729777376);
                                                                                    continue Label_4789_Outer;
                                                                                }
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1914151032) {
                                                                                    n2 ^= 0x7328B52F;
                                                                                    break Label_4410;
                                                                                }
                                                                                continue Label_3703;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        n2 = cvyspgugtyjrdrku(n4, 2113100399);
                                                        try {
                                                            if (ogwwobatgayyjyld.yphcfoidvruxcacx(n2) != 187663042) {
                                                                throw null;
                                                            }
                                                            throw new IllegalAccessException();
                                                            iftrue(Label_3008:)(ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 701186730 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x48C40E32 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 811118059 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x2B68F7D9 ^ n2));
                                                            throw new IOException("double");
                                                        }
                                                        catch (final IllegalAccessException ex4) {
                                                            switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n2)) {
                                                                case -1303324440: {
                                                                    n2 ^= 0x6B5937EA;
                                                                    break;
                                                                }
                                                                case 811118059: {
                                                                    n2 ^= 0x1B18394A;
                                                                    break;
                                                                }
                                                                default: {
                                                                    throw new RuntimeException("Error in hash");
                                                                }
                                                            }
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -392599621) {
                                                            Label_3192:
                                                                while (true) {
                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                                        case 449250649: {
                                                                            continue Label_4789_Outer;
                                                                        }
                                                                        case 39148045: {
                                                                            break Label_3192;
                                                                        }
                                                                        case 1144488453: {
                                                                            break Label_3213;
                                                                        }
                                                                        default: {
                                                                            continue Label_4085;
                                                                        }
                                                                    }
                                                                }
                                                                n2 ^= 0x282EE16;
                                                                break Label_3213;
                                                            }
                                                            continue Label_4789;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            continue Label_3213;
                                        }
                                        final String s3 = string3;
                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -57796853) {
                                            return (Triple<String, String, String>)new Triple((Object)s3, (Object)string, (Object)string2);
                                        }
                                        continue Label_3397;
                                    }
                                }
                            }
                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -1722848534 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x466B9DF5 ^ n4) || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != 1573522323 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x5EEB1260 ^ n4) || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != 2130253376 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x7BBD6461 ^ n4) || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -703301495 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x1046925B ^ n4)) {}
                            throw new RuntimeException("double");
                        }
                        cvyspgugtyjrdrku = (0x68D484EA ^ n4);
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == -1867489318) {
                        Label_0816:
                            while (true) {
                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(cvyspgugtyjrdrku)) {
                                    case 275029422: {
                                        continue;
                                    }
                                    case 252372256: {}
                                    case 335673408: {
                                        break Label_0816;
                                    }
                                    default: {
                                        continue Label_3513;
                                    }
                                }
                            }
                            return null;
                        }
                        break;
                    }
                    if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -1867489318) {
                        while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -1867489318 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x519DA67 ^ cvyspgugtyjrdrku)) {}
                        throw new IOException("double");
                    }
                    n2 = (0x3083B525 ^ cvyspgugtyjrdrku);
                }
            }
            while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1370765000 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x26420F86 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1047776448 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x93677B3 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1749658734 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x59D11E9B ^ n2)) {}
            throw new IOException();
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -621423559 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4968D3E6 ^ n)) {}
        throw new IllegalAccessException("double");
    }
    
    private final boolean isChineseUser(final int n) {
        int cvyspgugtyjrdrku = 0xE2F8106 ^ (0x67F2FF22 ^ 0x340718E4);
        Label_0263: {
            if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == -288147966) {
                cvyspgugtyjrdrku ^= 0x5E0AFDA8;
                Label_0336: {
                    if ((this.getConfig().contains(azeemuwjgf(sllbugnqwzehlum(), cvyspgugtyjrdrku)) ? 1 : 0) != (0x3D09B68 ^ cvyspgugtyjrdrku)) {
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == 512023360) {
                            return this.getConfig().getBoolean(azeemuwjgf(wxwkyionkbwdoos(), 0x305133F0 ^ cvyspgugtyjrdrku));
                        }
                    }
                    else {
                        cvyspgugtyjrdrku = cvyspgugtyjrdrku(cvyspgugtyjrdrku, 1394506617);
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == -2039021430) {
                            return (byte)(0x258803CF ^ (0x7546E3DE ^ cvyspgugtyjrdrku)) != 0;
                        }
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -2039021430) {
                            while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -2039021430 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x7093596C ^ cvyspgugtyjrdrku)) {}
                            throw new IOException("double");
                        }
                    Label_0252:
                        while (true) {
                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(cvyspgugtyjrdrku)) {
                                case 1992989963: {
                                    continue;
                                }
                                case 210797294: {
                                    break Label_0252;
                                }
                                default: {
                                    break Label_0263;
                                }
                                case 1769384781: {
                                    break Label_0336;
                                }
                            }
                        }
                        cvyspgugtyjrdrku ^= 0x7B0F0FA8;
                    }
                }
                while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 512023360 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x7316A49F ^ cvyspgugtyjrdrku) || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 1578073545 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x156C8B82 ^ cvyspgugtyjrdrku) || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 742399609 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x4416C4C5 ^ cvyspgugtyjrdrku)) {}
                throw new IOException();
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -288147966 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x2B631484 ^ cvyspgugtyjrdrku)) {}
        throw new IllegalAccessException("double");
    }
    
    public void onDisable() {
        int cvyspgugtyjrdrku = 0x4B85DA21 ^ (0x4A3189B2 ^ 0x340718E4);
        Label_0375: {
            if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == -1382392903) {
                cvyspgugtyjrdrku ^= 0x74B6ED50;
                Label_0417: {
                    if (this.cuyLoader != null) {
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == 137179450) {
                            cvyspgugtyjrdrku ^= 0x5A9B7803;
                            CuyLoader cuyLoader = this.cuyLoader;
                            Label_0130: {
                                if (cuyLoader == null) {
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -587796192) {
                                        break Label_0417;
                                    }
                                    cvyspgugtyjrdrku ^= 0x606DCA24;
                                    Intrinsics.throwUninitializedPropertyAccessException(azeemuwjgf(vvaljlazggcyeaa(), cvyspgugtyjrdrku));
                                    cuyLoader = null;
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == -543645693) {
                                        cvyspgugtyjrdrku ^= 0x156ABF2;
                                        break Label_0130;
                                    }
                                }
                                else {
                                    cvyspgugtyjrdrku = cvyspgugtyjrdrku(cvyspgugtyjrdrku, 480907149);
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == 967216456) {
                                    Label_0364:
                                        while (true) {
                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(cvyspgugtyjrdrku)) {
                                                case 630257865: {
                                                    break Label_0130;
                                                }
                                                case 2024899715: {
                                                    continue;
                                                }
                                                case 113345466: {
                                                    break Label_0364;
                                                }
                                                default: {
                                                    break Label_0375;
                                                }
                                            }
                                        }
                                        cvyspgugtyjrdrku ^= 0x7D916E5B;
                                        break Label_0130;
                                    }
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == 967216456) {
                                        while (true) {
                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(cvyspgugtyjrdrku)) {
                                                case 1573433827: {
                                                    continue;
                                                }
                                                case 113345466: {
                                                    cvyspgugtyjrdrku ^= 0x78FAF18F;
                                                }
                                                default: {
                                                    break Label_0417;
                                                }
                                            }
                                        }
                                    }
                                }
                                while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -543645693 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x2788AA90 ^ cvyspgugtyjrdrku) || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 967216456 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x4FA40A23 ^ cvyspgugtyjrdrku)) {}
                                throw new IOException("double");
                            }
                            cuyLoader.onDisable();
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == -718405741) {
                                return;
                            }
                            while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -718405741 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x4CE783DE ^ cvyspgugtyjrdrku)) {}
                            throw new RuntimeException("double");
                        }
                    }
                    else {
                        cvyspgugtyjrdrku ^= 0x91877E6;
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == 1089375754) {
                            cvyspgugtyjrdrku(cvyspgugtyjrdrku, 1773686185);
                            return;
                        }
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) == 1089375754) {
                            cvyspgugtyjrdrku ^= 0x37D3F1E7;
                        }
                    }
                }
                while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -587796192 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x781F7D49 ^ cvyspgugtyjrdrku) || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 1089375754 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x1B821858 ^ cvyspgugtyjrdrku) || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 221045569 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x6093907C ^ cvyspgugtyjrdrku) || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != 137179450 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x69CD01D3 ^ cvyspgugtyjrdrku)) {}
                throw new IOException();
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != -1382392903 || ogwwobatgayyjyld.widdxeioafyswjhq(cvyspgugtyjrdrku) != (0x206487B ^ cvyspgugtyjrdrku)) {}
        throw new IllegalAccessException("double");
    }
    
    static {
        (CuyPlugin.nothing_to_see_here = new String[13])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        CuyPlugin.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u28e0\u28f6\u287e\u280f\u2809\u2819\u2833\u28a6\u2840\u2800\u2800\u2800\u28a0\u281e\u2809\u2819\u2832\u2840\u2800    ";
        CuyPlugin.nothing_to_see_here[2] = "\u2800\u2800\u2800\u28f4\u283f\u280f\u2800\u2800\u2800\u2800\u2800\u2800\u28b3\u2840\u2800\u284f\u2800\u2800\u2800\u2800\u2800\u28b7     ";
        CuyPlugin.nothing_to_see_here[3] = "\u2800\u2800\u28a0\u28df\u28cb\u2840\u2880\u28c0\u28c0\u2840\u2800\u28c0\u2840\u28e7\u2800\u28b8\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        CuyPlugin.nothing_to_see_here[4] = "\u2800\u2800\u28b8\u28ef\u286d\u2801\u2838\u28db\u28df\u2806\u2874\u28fb\u2872\u28ff\u2800\u28f8\u2800\u2800OK\u2800 \u2847    ";
        CuyPlugin.nothing_to_see_here[5] = "\u2800\u2800\u28df\u28ff\u286d\u2800\u2800\u2800\u2800\u2800\u28b1\u2800\u2800\u28ff\u2800\u28b9\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        CuyPlugin.nothing_to_see_here[6] = "\u2800\u2800\u2819\u28bf\u28ef\u2804\u2800\u2800\u2800\u2880\u2840\u2800\u2800\u287f\u2800\u2800\u2847\u2800\u2800\u2800\u2800\u287c     ";
        CuyPlugin.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2839\u28f6\u2806\u2800\u2800\u2800\u2800\u2800\u2874\u2803\u2800\u2800\u2818\u2824\u28c4\u28e0\u281e\u2800     ";
        CuyPlugin.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u28b8\u28f7\u2866\u28a4\u2864\u28a4\u28de\u28c1\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        CuyPlugin.nothing_to_see_here[9] = "\u2800\u2800\u2880\u28e4\u28f4\u28ff\u28cf\u2801\u2800\u2800\u2838\u28cf\u28af\u28f7\u28d6\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800    ";
        CuyPlugin.nothing_to_see_here[10] = "\u2880\u28fe\u28fd\u28ff\u28ff\u28ff\u28ff\u281b\u28b2\u28f6\u28fe\u2889\u2877\u28ff\u28ff\u2835\u28ff\u2800\u2800\u2800\u2800\u2800\u2800    ";
        CuyPlugin.nothing_to_see_here[11] = "\u28fc\u28ff\u280d\u2809\u28ff\u286d\u2809\u2819\u28ba\u28c7\u28fc\u284f\u2800\u2800\u2800\u28c4\u28b8\u2800\u2800\u2800\u2800\u2800\u2800    ";
        CuyPlugin.nothing_to_see_here[12] = "\u28ff\u28ff\u28e7\u28c0\u28ff.........\u28c0\u28f0\u28cf\u28d8\u28c6\u28c0\u2800\u2800       ";
        final int n = 0x3A6F681 ^ (0x35A63A37 ^ Integer.parseInt("864711397"));
        CuyPlugin.hjebucdtlh = ByteBuffer.wrap(pkdpohqrdosxkjj()).asCharBuffer().toString();
        CuyPlugin.VYwNDp8Bs1 = (0x69E339FF ^ new Random(7499701545091191557L).nextInt());
        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 743830168) {
            Companion = new Companion(null, 407480799);
            return;
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 743830168 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x12F6AC1B ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 219998761 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x1A5BE529 ^ n)) {}
        throw new RuntimeException();
    }
    
    public static String azeemuwjgf(final byte[] array, final int i) {
        final byte[] bytes = Integer.toString(i).getBytes();
        final int n = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int beginIndex = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = CuyPlugin.hjebucdtlh.substring(beginIndex, beginIndex + n).getBytes(StandardCharsets.UTF_16BE);
        for (int j = 0; j < bytes2.length; ++j) {
            final byte[] array2 = bytes2;
            final int n2 = j;
            array2[n2] ^= bytes[j % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] hxxbybvvwggzwwt() {
        return new byte[] { 0, 0, 0, 27, 0, 0, 0, 0 };
    }
    
    private static byte[] dhxnlzqtlvmhxeb() {
        return new byte[] { 0, 0, 0, 16, 0, 0, 0, 27 };
    }
    
    private static byte[] kqcmuedfmiegozc() {
        return new byte[] { 0, 0, 0, 9, 0, 0, 0, 43 };
    }
    
    private static byte[] mykrbijhxknbhff() {
        return new byte[] { 0, 0, 0, 19, 0, 0, 0, 52 };
    }
    
    private static byte[] uhkwylfihhvvwew() {
        return new byte[] { 0, 0, 0, 14, 0, 0, 0, 71 };
    }
    
    private static byte[] lctumdcwtbinkvg() {
        return new byte[] { 0, 0, 0, 11, 0, 0, 0, 85 };
    }
    
    private static byte[] jbprjmoozayleqd() {
        return new byte[] { 0, 0, 0, 41, 0, 0, 0, 96 };
    }
    
    private static byte[] orvrvcpmpojhlyb() {
        return new byte[] { 0, 0, 0, 21, 0, 0, 0, -119 };
    }
    
    private static byte[] iwdcupsiufcuduo() {
        return new byte[] { 0, 0, 0, 14, 0, 0, 0, -98 };
    }
    
    private static byte[] fflmipvhuvaxrcg() {
        return new byte[] { 0, 0, 0, 7, 0, 0, 0, -84 };
    }
    
    private static byte[] cdfjcnlsganqsoo() {
        return new byte[] { 0, 0, 0, 8, 0, 0, 0, -77 };
    }
    
    private static byte[] gdjkywwzthyaxgt() {
        return new byte[] { 0, 0, 0, 5, 0, 0, 0, -69 };
    }
    
    private static byte[] nmqdtzyccqklqyk() {
        return new byte[] { 0, 0, 0, 4, 0, 0, 0, -64 };
    }
    
    private static byte[] yxqrifupuqygaom() {
        return new byte[] { 0, 0, 0, 53, 0, 0, 0, -60 };
    }
    
    private static byte[] duhjhalralpbmgw() {
        return new byte[] { 0, 0, 0, 16, 0, 0, 0, -7 };
    }
    
    private static byte[] hxrcbbszztuqiwz() {
        return new byte[] { 0, 0, 0, 16, 0, 0, 1, 9 };
    }
    
    private static byte[] sllbugnqwzehlum() {
        return new byte[] { 0, 0, 0, 14, 0, 0, 1, 25 };
    }
    
    private static byte[] wxwkyionkbwdoos() {
        return new byte[] { 0, 0, 0, 14, 0, 0, 1, 39 };
    }
    
    private static byte[] vvaljlazggcyeaa() {
        return new byte[] { 0, 0, 0, 9, 0, 0, 1, 53 };
    }
    
    private static byte[] pkdpohqrdosxkjj() {
        return new byte[] { 49, 95, 54, 71, 51, 76, 53, 73, 55, 75, 49, 13, 54, 28, 51, 23, 53, 85, 55, 81, 49, 84, 54, 86, 51, 86, 53, 74, 55, 93, 49, 25, 54, 91, 51, 77, 53, 94, 55, 75, 49, 67, 54, 86, 51, 74, 53, 23, 55, 86, 49, 82, 54, 71, 53, 93, 53, 83, 51, 78, 48, 125, 50, 91, 51, 70, 54, 71, 57, 81, 52, 92, 53, 80, 53, 83, 51, 17, 48, 26, 50, 27, 51, 27, 54, 26, 49, 85, 56, 68, 48, 78, 56, 125, 53, 94, 49, 87, 56, 85, 48, 82, 56, 67, 49, 85, 51, 87, 48, 76, 56, 122, 54, 92, 49, 83, 51, 65, 48, 75, 56, 117, 54, 95, 49, 83, 51, 86, 48, 93, 56, 75, 54, 24, 49, 28, 51, 28, 48, 22, 56, 16, 49, 83, 55, 85, 48, 69, 53, 116, 52, 88, 49, 90, 55, 86, 48, 88, 53, 80, 52, 31, 49, 26, 55, 30, 48, 31, 53, 30, 49, 84, 53, 89, 56, 89, 50, 71, 52, 67, 49, 123, 53, 90, 56, 89, 50, 80, 52, 85, 49, 69, 49, 119, 52, 95, 52, 24, 54, 64, 57, 83, 49, 85, 52, 89, 52, 92, 54, 22, 57, 66, 49, 75, 52, 95, 52, 92, 54, 67, 57, 81, 49, 77, 52, 16, 52, 84, 54, 95, 57, 81, 49, 92, 52, 94, 52, 75, 54, 83, 57, 18, 49, 95, 52, 95, 52, 77, 54, 88, 57, 86, 49, 25, 52, 89, 52, 86, 54, 22, 57, 81, 49, 86, 52, 94, 52, 94, 54, 95, 57, 85, 49, 24, 49, 90, 56, 71, 48, 64, 57, 71, 52, 9, 49, 29, 56, 28, 48, 89, 57, 82, 52, 87, 49, 71, 56, 29, 48, 85, 57, 68, 52, 90, 49, 83, 56, 9, 48, 7, 57, 7, 52, 3, 49, 2, 49, 75, 48, 66, 51, 82, 51, 67, 50, 66, 49, 74, 48, 94, 51, 94, 51, 87, 50, 30, 49, 22, 48, 25, 51, 30, 51, 25, 51, 115, 53, 118, 50, 122, 50, 118, 55, 124, 54, 120, 53, 107, 51, 102, 53, 103, 50, 116, 50, 123, 55, 103, 54, 124, 53, 113, 53, 119, 51, 114, 53, 96, 50, 112, 50, 116, 55, 96, 51, 101, 53, 108, 50, 123, 50, 123, 55, 94, 55, 68, 56, 89, 52, 84, 53, 23, 48, 84, 49, 89, 53, 90, 56, 91, 55, 95, 55, 69, 56, 21, 52, 90, 53, 82, 48, 23, 49, 91, 53, 85, 56, 70, 55, 68, 55, 17, 56, 65, 52, 87, 53, 23, 48, 89, 49, 87, 53, 90, 56, 24, 55, 94, 55, 68, 56, 89, 52, 84, 53, 23, 48, 67, 49, 65, 53, 68, 56, 80, 55, 16, 55, 91, 56, 84, 52, 78, 53, 86, 48, 25, 49, 84, 53, 85, 56, 91, 55, 87, 55, 31, 56, 102, 52, 76, 53, 69, 48, 94, 49, 86, 53, 83, 55, 68, 55, 94, 56, 96, 52, 72, 53, 71, 48, 82, 49, 74, 53, 119, 56, 84, 55, 67, 55, 84, 56, 29, 52, 22, 53, 25, 48, 25, 49, 17, 50, 68, 54, 94, 50, 117, 48, 86, 55, 79, 50, 85, 54, 67, 50, 122, 48, 88, 55, 75, 50, 85, 54, 25, 50, 23, 48, 23, 55, 22, 50, 25, 54, 119, 48, 120, 50, 112, 50, 126, 54, 117, 48, 29, 50, 117, 50, 127, 54, 119, 48, 113, 50, 109, 50, 121, 54, 123, 48, 126, 56, 117, 52, 121, 51, 124, 51, 124, 48, 121, 54, 25, 49, 127, 53, 124, 50, 115, 56, 119, 52, 101, 51, 124, 51, 125, 48, 118, 50, 83, 55, 76, 53, 75, 55, 117, 51, 89, 50, 81, 55, 93, 53, 87, 55, 75 };
    }
    
    private static int cvyspgugtyjrdrku(final int n, final int n2) {
        return n2 ^ n;
    }
    
    @Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B	\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u0006\u0010\u0007"\u0004\b\b\u0010	¨\u0006
                                                       """ }, d2 = { "Lme/pi3ro/cuy/CuyPlugin$Companion;", "", "<init>", "()V", "INSTANCE", "Lme/pi3ro/cuy/CuyPlugin;", "getINSTANCE", "()Lme/pi3ro/cuy/CuyPlugin;", "setINSTANCE", "(Lme/pi3ro/cuy/CuyPlugin;)V", "cuy-plugin" })
    public static final class Companion
    {
        private static int vv9jUDsnGl = 0;
        private transient int 4eTHYwUMyk = 2132947337;
        private static byte[] qhfjefgick;
        private static String[] nothing_to_see_here;
        
        private Companion() {
            final int n = 0x7926BB0B ^ (0x344F082D ^ Integer.parseInt("1451580819"));
            rmuvslhwrlbxfzrj(n, 1097743576);
        }
        
        @NotNull
        public final CuyPlugin getINSTANCE() {
            int n = 0x719B912F ^ (0x41EDA8B3 ^ 0x4715706);
            Label_0310: {
                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1606716207) {
                    n ^= 0x38F94A60;
                    final CuyPlugin instance = CuyPlugin.INSTANCE;
                    Label_0271: {
                        if (instance != null) {
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1743857616) {
                                return instance;
                            }
                        }
                        else {
                            Label_0119: {
                            Label_0112:
                                while (true) {
                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                        case 671255776: {
                                            continue;
                                        }
                                        case 153906010: {
                                            break Label_0112;
                                        }
                                        case 974409032: {
                                            break Label_0119;
                                        }
                                        default: {
                                            break Label_0271;
                                        }
                                    }
                                }
                                n ^= 0x26A16E70;
                            }
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1392137297) {
                                Label_0195: {
                                    Label_0188: {
                                    Label_0222:
                                        while (true) {
                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                case 930203876: {
                                                    continue;
                                                }
                                                case 35162676: {
                                                    break Label_0188;
                                                }
                                                case 856214761: {
                                                    break Label_0195;
                                                }
                                                default: {
                                                    break Label_0222;
                                                }
                                            }
                                        }
                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 431502034 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x5202ADC4 ^ n)) {}
                                        throw new RuntimeException("double");
                                    }
                                    n ^= 0x69684CD0;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException(qeumsdfinp(xfosbqseqvgjfzb(), n));
                                return null;
                            }
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1392137297) {
                                n ^= 0x54C468B8;
                            }
                            break Label_0310;
                        }
                    }
                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1743857616 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x53C6610F ^ n)) {}
                    throw new IOException("double");
                }
            }
            while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -187100781 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x51C21DF6 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1392137297 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x56A7912A ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -252092062 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0xE8CF5DC ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1606716207 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x77C5675C ^ n)) {}
            throw new IOException();
        }
        
        public final void setINSTANCE(@NotNull final CuyPlugin instance, final int n) {
            int n2 = 0x7BAE8F95 ^ (0x6A58BD55 ^ 0x4715706);
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1405407696) {
                n2 ^= 0x2B54A135;
                Intrinsics.checkNotNullParameter((Object)instance, qeumsdfinp(gtqtjmjsoklmxep(), n2));
                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -157407335) {
                    CuyPlugin.INSTANCE = instance;
                    return;
                }
            }
            while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1405407696 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x245BAE1F ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -157407335 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x367EBA0D ^ n2)) {}
            throw new IOException();
        }
        
        static {
            (Companion.nothing_to_see_here = new String[15])[0] = "\u2804\u2804\u2804\u28b0\u28e7\u28fc\u28ef\u2804\u28f8\u28e0\u28f6\u28f6\u28e6\u28fe\u2804\u2804\u2804\u2804\u2840\u2804\u2880\u28ff\u28ff\u2804\u2804\u2804\u28b8\u2847\u2804\u2804";
            Companion.nothing_to_see_here[1] = "\u2804\u2804\u2804\u28fe\u28ff\u283f\u283f\u2836\u283f\u28bf\u28ff\u28ff\u28ff\u28ff\u28e6\u28e4\u28c4\u2880\u2845\u28a0\u28fe\u28db\u2849\u2804\u2804\u2804\u2838\u2880\u28ff\u2804";
            Companion.nothing_to_see_here[2] = "\u2804\u2804\u2880\u284b\u28e1\u28f4\u28f6\u28f6\u2840\u2804\u2804\u2819\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28f4\u28ff\u28ff\u28ff\u2883\u28e4\u28c4\u28c0\u28e5\u28ff\u28ff\u2804";
            Companion.nothing_to_see_here[3] = "\u2804\u2804\u28b8\u28c7\u283b\u28ff\u28ff\u28ff\u28e7\u28c0\u2880\u28e0\u284c\u28bb\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28ff\u28ff\u28ff\u2804";
            Companion.nothing_to_see_here[4] = "\u2804\u2880\u28b8\u28ff\u28f7\u28e4\u28e4\u28e4\u28ec\u28d9\u28db\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u28ff\u28ff\u284d\u2804\u2804\u2880\u28e4\u28c4\u2809\u280b\u28f0";
            Companion.nothing_to_see_here[5] = "\u2804\u28fc\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u2887\u28ff\u28ff\u2877\u2836\u2836\u28bf\u28ff\u28ff\u2807\u2880\u28e4";
            Companion.nothing_to_see_here[6] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u2847\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28f6\u28e5\u28f4\u28ff\u2857";
            Companion.nothing_to_see_here[7] = "\u2880\u2808\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u285f\u2804";
            Companion.nothing_to_see_here[8] = "\u28b8\u28ff\u28e6\u28cc\u28db\u28fb\u28ff\u28ff\u28e7\u2819\u281b\u281b\u286d\u2805\u2812\u2826\u282d\u28ed\u287b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2804";
            Companion.nothing_to_see_here[9] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2846\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2839\u2808\u288b\u28fd\u28ff\u28ff\u28ff\u28ff\u28f5\u28fe\u2803\u2804";
            Companion.nothing_to_see_here[10] = "\u2804\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2804\u28f4\u28ff\u28f6\u28c4\u2804\u28f4\u28f6\u2804\u2880\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2804\u2804";
            Companion.nothing_to_see_here[11] = "\u2804\u2804\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2844\u28bb\u28ff\u28ff\u28ff\u2804\u28ff\u28ff\u2840\u28fe\u28ff\u28ff\u28ff\u28ff\u28db\u281b\u2801\u2804\u2804\u2804";
            Companion.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2808\u281b\u28bf\u28ff\u28ff\u28ff\u2801\u281e\u28bf\u28ff\u28ff\u2844\u28bf\u28ff\u2847\u28f8\u28ff\u28ff\u283f\u281b\u2801\u2804\u2804\u2804\u2804\u2804";
            Companion.nothing_to_see_here[13] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2809\u283b\u28ff\u28ff\u28fe\u28e6\u2859\u283b\u28f7\u28fe\u28ff\u2803\u283f\u280b\u2801\u2804\u2804\u2804\u2804\u2804\u2880\u28e0\u28f4";
            Companion.nothing_to_see_here[14] = "\u28ff\u28ff\u28ff\u28f6\u28f6\u28ee\u28e5\u28d2\u2832\u28ae\u28dd\u287f\u28ff\u28ff\u2846\u28ff\u287f\u2803\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28e0\u28f4\u28ff\u28ff\u28ff";
            Companion.qhfjefgick = eyhfxmjvdgtwjbf();
            Companion.vv9jUDsnGl = (0x8155C05B ^ new Random(2584209921421051671L).nextInt());
        }
        
        public static String qeumsdfinp(final byte[] bytes, final int i) {
            final byte[] bytes2 = Integer.toString(i).getBytes();
            for (int j = 0; j < bytes.length; ++j) {
                final int n = j;
                bytes[n] ^= bytes2[j % bytes2.length];
                final int n2 = j;
                bytes[n2] ^= Companion.qhfjefgick[j % Companion.qhfjefgick.length];
            }
            return new String(bytes, StandardCharsets.UTF_16);
        }
        
        private static byte[] eyhfxmjvdgtwjbf() {
            return new byte[] { 39, 43, 126, 10, 47, 20, 82, 102, 98, 74, 74, 70, 11, 35, 40, 69, 106, 49, 15, 55, 114, 89, 91, 7, 104, 123, 59, 67, 36, 69, 33, 18, 122, 86, 97, 52, 38, 2, 2, 21, 85, 98, 67, 51, 48, 74, 60, 52, 118, 108, 13, 35, 63, 64, 52, 25, 75, 121 };
        }
        
        private static byte[] xfosbqseqvgjfzb() {
            return new byte[] { -24, -27, 76, 116, 25, 109, 107, 0, 85, 38, 123, 54, 57, 90, 30, 49, 83, 65 };
        }
        
        private static byte[] gtqtjmjsoklmxep() {
            return new byte[] { -24, -28, 75, 2, 31, 81, 103, 58, 82, 9, 123, 91, 62, 40, 24, 77 };
        }
        
        private static int rmuvslhwrlbxfzrj(final int n, final int n2) {
            return n2 ^ n;
        }
    }
}
