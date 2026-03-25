// 
// Decompiled by Procyon v0.6.0
// 

package me.pi3ro.cuy.utils;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.io.CloseableKt;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.CopyOption;
import java.io.InputStream;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import dbjrsyajbkgezbtp.ogwwobatgayyjyld;
import kotlin.jvm.internal.Intrinsics;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import me.pi3ro.cuy.CuyPlugin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.Metadata;

@Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u000bJ\b\u0010\f\u001a\u00020	H\u0002J\b\u0010\r\u001a\u00020	H\u0002J&\u0010\u000e\u001a\u00020	2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0014""" }, d2 = { "Lme/pi3ro/cuy/utils/ResourceManager;", "", "plugin", "Lme/pi3ro/cuy/CuyPlugin;", "<init>", "(Lme/pi3ro/cuy/CuyPlugin;)V", "logger", "Ljava/util/logging/Logger;", "copyResources", "", "productName", "", "copyEconomyResources", "copyDuelsResources", "copyFiles", "resourceDir", "targetDir", "Ljava/io/File;", "files", "", "cuy-plugin" })
@SourceDebugExtension({ """
                        SMAP
                        ResourceManager.kt
                        Kotlin
                        *S Kotlin
                        *F
                        + 1 ResourceManager.kt
                        me/pi3ro/cuy/utils/ResourceManager
                        + 2 _Collections.kt
                        kotlin/collections/CollectionsKt___CollectionsKt
                        *L
                        1#1,65:1
                        1869#2,2:66
                        *S KotlinDebug
                        *F
                        + 1 ResourceManager.kt
                        me/pi3ro/cuy/utils/ResourceManager
                        *L
                        52#1:66,2
                        *E
                        """ })
public final class ResourceManager
{
    @NotNull
    private final CuyPlugin plugin;
    @NotNull
    private final Logger logger;
    private static int PAkNCM5YrH = 0;
    private transient int n8nVrtjlZz = 124414882;
    private static String[] nothing_to_see_here;
    
    public ResourceManager(@NotNull final CuyPlugin plugin, final int n) {
        Intrinsics.checkNotNullParameter((Object)plugin, "plugin");
        int n2 = 0x3ED17DE ^ (0x73A85A52 ^ Integer.parseInt("311139119"));
    Label_0119:
        while (true) {
            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                case 1415635198: {
                    continue;
                }
                case 259054869: {
                    n2 ^= 0x5AAC523B;
                }
                case 247415042: {
                    break Label_0119;
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
        this.plugin = plugin;
        final Logger logger = this.plugin.getLogger();
        Intrinsics.checkNotNullExpressionValue((Object)logger, "getLogger(...)");
        this.logger = logger;
    }
    
    public final void copyResources(@NotNull final String s, final int n) {
        int zirlkruxzkeqwmgp = 0x52C0F978 ^ (0x7E78A06D ^ 0x6AC03CDB);
        Label_1106: {
            if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) == 868429426) {
                int n2 = 0x707C1AC0 ^ zirlkruxzkeqwmgp;
                Intrinsics.checkNotNullParameter((Object)s, icpcyccxvq(lfrhfagcmkmyvqt(), qaiwhiyzxfgbpgw(), n2));
                Label_0904: {
                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1339819919) {
                        final int n3 = 0x61FBE0A ^ n2;
                        final String lowerCase = s.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, icpcyccxvq(zprtkjdnjruagsw(), qaiwhiyzxfgbpgw(), n3));
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -2132932575) {
                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -2132932575 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x184AA3D4 ^ n3)) {}
                            throw new IOException("double");
                        }
                        final int n4 = 0x2F9560EC ^ n3;
                        final String s2 = lowerCase;
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) == -59437248) {
                            zirlkruxzkeqwmgp = (0x5A8692E9 ^ n4);
                            if ((Intrinsics.areEqual((Object)s2, (Object)icpcyccxvq(xbetfufsbpbppbu(), qaiwhiyzxfgbpgw(), zirlkruxzkeqwmgp)) ? 1 : 0) != (0x45083301 ^ zirlkruxzkeqwmgp)) {
                                if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != 675387402) {
                                    break Label_1106;
                                }
                                n2 = (0x2D357CE4 ^ zirlkruxzkeqwmgp);
                                this.copyEconomyResources(1262408610);
                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1105887019) {
                                    break Label_0904;
                                }
                                final int zirlkruxzkeqwmgp2 = zirlkruxzkeqwmgp(n2, 1771011788);
                                try {
                                    if (ogwwobatgayyjyld.yphcfoidvruxcacx(zirlkruxzkeqwmgp2) != 26677156) {
                                        throw null;
                                    }
                                    throw new IOException();
                                }
                                catch (final IOException ex) {
                                    int zirlkruxzkeqwmgp3 = 0;
                                    switch (ogwwobatgayyjyld.gicktsuzorogcxcs(zirlkruxzkeqwmgp2)) {
                                        case 227641672: {
                                            zirlkruxzkeqwmgp3 = zirlkruxzkeqwmgp(zirlkruxzkeqwmgp2, 1416573837);
                                            break;
                                        }
                                        default: {
                                            throw new IOException("Error in hash");
                                        }
                                        case 2030758824: {
                                            zirlkruxzkeqwmgp3 = (0x5AFC5FD1 ^ zirlkruxzkeqwmgp2);
                                            break;
                                        }
                                    }
                                    Label_0390: {
                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp3) == -1360521950) {
                                            while (true) {
                                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(zirlkruxzkeqwmgp3)) {
                                                    case 1612938710: {
                                                        continue;
                                                    }
                                                    default: {
                                                        break Label_0390;
                                                    }
                                                    case 1385389220: {}
                                                    case 106717376: {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp3) != -1360521950 || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp3) != (0x26FA2971 ^ zirlkruxzkeqwmgp3)) {}
                                    throw new RuntimeException("double");
                                }
                            }
                        Label_0826:
                            while (true) {
                                Label_0483: {
                                    Label_0476: {
                                        while (true) {
                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(zirlkruxzkeqwmgp)) {
                                                case 1148682156: {
                                                    continue;
                                                }
                                                case 96446425: {
                                                    break Label_0476;
                                                }
                                                case 1576194577: {
                                                    break Label_0483;
                                                }
                                                default: {
                                                    break Label_0826;
                                                }
                                            }
                                        }
                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != -903007662 || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != (0x3F75D452 ^ zirlkruxzkeqwmgp)) {}
                                        throw new IllegalAccessException("double");
                                    }
                                    zirlkruxzkeqwmgp ^= 0x55CD4050;
                                }
                                if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) == -2043962744) {
                                    zirlkruxzkeqwmgp = zirlkruxzkeqwmgp(zirlkruxzkeqwmgp, 1233179931);
                                    Label_0734: {
                                        if ((Intrinsics.areEqual((Object)s2, (Object)icpcyccxvq(sybzfxevuvylgic(), qaiwhiyzxfgbpgw(), zirlkruxzkeqwmgp)) ? 1 : 0) != (0x5945A64A ^ zirlkruxzkeqwmgp)) {
                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != -903007662) {
                                                continue Label_0826;
                                            }
                                            zirlkruxzkeqwmgp ^= 0x4565A9EB;
                                            this.copyDuelsResources(1380414083);
                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) == -520061688) {
                                                return;
                                            }
                                        }
                                        else {
                                            Label_0699: {
                                            Label_0692:
                                                while (true) {
                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(zirlkruxzkeqwmgp)) {
                                                        case 1335682959: {
                                                            continue;
                                                        }
                                                        case 217492330: {
                                                            break Label_0692;
                                                        }
                                                        case 1351811355: {
                                                            break Label_0699;
                                                        }
                                                        default: {
                                                            break Label_0734;
                                                        }
                                                    }
                                                }
                                                zirlkruxzkeqwmgp ^= 0x426AFD9;
                                            }
                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) == -350729062) {
                                                zirlkruxzkeqwmgp(zirlkruxzkeqwmgp, 1468004395);
                                                return;
                                            }
                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) == -350729062) {
                                                n2 = zirlkruxzkeqwmgp(zirlkruxzkeqwmgp, 1278433098);
                                                break Label_0904;
                                            }
                                        }
                                    }
                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != -520061688 || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != (0x8B47313 ^ zirlkruxzkeqwmgp) || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != -350729062 || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != (0x2A4F60E7 ^ zirlkruxzkeqwmgp)) {}
                                    throw new RuntimeException("double");
                                }
                                break;
                            }
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) == -2043962744) {
                                n2 = zirlkruxzkeqwmgp(zirlkruxzkeqwmgp, 26553736);
                                break Label_0904;
                            }
                            while (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != -2043962744 || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != (0x33A9759F ^ zirlkruxzkeqwmgp)) {}
                            throw new IOException("double");
                        }
                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -59437248 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x656E001A ^ n4)) {}
                        throw new RuntimeException("double");
                    }
                }
                while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1357352384 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x5C11CA94 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 2030758824 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x540692D ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 227641672 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x456CC16B ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1105887019 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x36E5332A ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1339819919 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x6475DBEB ^ n2)) {}
                throw new IllegalAccessException();
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != 675387402 || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != (0x7B8CF9BE ^ zirlkruxzkeqwmgp) || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != 868429426 || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != (0x5DF3784E ^ zirlkruxzkeqwmgp)) {}
        throw new IOException("double");
    }
    
    private final void copyEconomyResources(final int n) {
        int n2 = 0x7BFA67D ^ (0xDFDC82A ^ 0x6AC03CDB);
        Label_1626: {
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 68326499) {
                final int n3 = 0x2977F672 ^ n2;
                final File file = new File(icpcyccxvq(qzqrcutydtlltlg(), qaiwhiyzxfgbpgw(), n3));
                if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == 1336748018) {
                    int n4 = 0x5B60C6B ^ n3;
                    final String[] array = new String[(byte)(0x4C43A89E ^ n4)];
                    array[(byte)(0x4C43A895 ^ n4)] = icpcyccxvq(uxzzdcacdnkjlcd(), qaiwhiyzxfgbpgw(), n4);
                    final String[] array2 = array;
                    final byte b = (byte)(0x4C43A894 ^ n4);
                    Label_1415: {
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) == 1646085290) {
                            n2 = (0x6F74A717 ^ n4);
                            array2[b] = icpcyccxvq(lwnoaqwcxuutnib(), qaiwhiyzxfgbpgw(), n2);
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 431520785) {
                                int n5 = 0x20997346 ^ n2;
                                final String[] array3 = array;
                                final byte b2 = (byte)(0x3AE7CC6 ^ n5);
                                Label_1067: {
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n5) == 494134816) {
                                        final int n6 = 0x55195257 ^ n5;
                                        array3[b2] = icpcyccxvq(weuzqyipjhmakuu(), qaiwhiyzxfgbpgw(), n6);
                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n6) != -1246137190) {
                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n6) != -1246137190 || ogwwobatgayyjyld.widdxeioafyswjhq(n6) != (0x25266CAD ^ n6)) {}
                                            throw new IllegalAccessException("double");
                                        }
                                        n5 = (0x117595BB ^ n6);
                                        final String[] array4 = array;
                                        final byte b3 = (byte)(0x47C2BB2B ^ n5);
                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n5) == 1041619266) {
                                            int n7 = 0x72ABACEC ^ n5;
                                            array4[b3] = icpcyccxvq(ndolntwslrkbhqt(), qaiwhiyzxfgbpgw(), n7);
                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n7) == -1421296095) {
                                                final int n8 = 0x7B8BD760 ^ n7;
                                                final String[] array5 = array;
                                                final byte b4 = (byte)(0x4EE2C0A0 ^ n8);
                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n8) != 1997931810) {
                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n8) != 1997931810 || ogwwobatgayyjyld.widdxeioafyswjhq(n8) != (0x63D411B4 ^ n8)) {}
                                                    throw new RuntimeException("double");
                                                }
                                                n7 = (0x5CE3D2B ^ n8);
                                                array5[b4] = icpcyccxvq(zlwusjidxellnje(), qaiwhiyzxfgbpgw(), n7);
                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n7) == 1499982970) {
                                                    final int n9 = 0x304F86DA ^ n7;
                                                    final String[] array6 = array;
                                                    final byte b5 = (byte)(0x7B637B50 ^ n9);
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n9) != -618931541) {
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n9) != -618931541 || ogwwobatgayyjyld.widdxeioafyswjhq(n9) != (0x1F45BBE7 ^ n9)) {}
                                                        throw new IllegalAccessException("double");
                                                    }
                                                    n5 = (0x7B32670 ^ n9);
                                                    array6[b5] = icpcyccxvq(qswawvkksfhxmqu(), qaiwhiyzxfgbpgw(), n5);
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n5) != -427628245) {
                                                        break Label_1067;
                                                    }
                                                    n4 = (0x4DA26067 ^ n5);
                                                    final String[] array7 = array;
                                                    final byte b6 = (byte)(0x31723D44 ^ n4);
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) == -1953371631) {
                                                        int n10 = 0x1B17D966 ^ n4;
                                                        array7[b6] = icpcyccxvq(bhvnczuugzrmdxx(), qaiwhiyzxfgbpgw(), n10);
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n10) == 1395597601) {
                                                            n2 = (0x708C58C3 ^ n10);
                                                            final String[] array8 = array;
                                                            final byte b7 = (byte)(0x5AE9BCE0 ^ n2);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -682760390) {
                                                                break Label_1626;
                                                            }
                                                            n2 ^= 0x10478C57;
                                                            array8[b7] = icpcyccxvq(aflaoiebtshhsgq(), qaiwhiyzxfgbpgw(), n2);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1433503106) {
                                                                break Label_1626;
                                                            }
                                                            n4 = (0x23030561 ^ n2);
                                                            final String[] array9 = array;
                                                            final byte b8 = (byte)(0x69AD35D9 ^ n4);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) != 1298771595) {
                                                                break Label_1415;
                                                            }
                                                            n2 = (0x393623EE ^ n4);
                                                            array9[b8] = icpcyccxvq(xpnfshjonesuspy(), qaiwhiyzxfgbpgw(), n2);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -2066173446) {
                                                                break Label_1626;
                                                            }
                                                            n2 ^= 0x49AA671B;
                                                            final String[] array10 = array;
                                                            final byte b9 = (byte)(0x1931712D ^ n2);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -913602272) {
                                                                break Label_1626;
                                                            }
                                                            n4 = (0x680BCE98 ^ n2);
                                                            array10[b9] = icpcyccxvq(pbhzzmidacqojxv(), qaiwhiyzxfgbpgw(), n4);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -1982464541) {
                                                                break Label_1415;
                                                            }
                                                            n2 = (0x3BA3D103 ^ n4);
                                                            final String[] array11 = array;
                                                            final byte b10 = (byte)(0x4A996EB5 ^ n2);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1422620154) {
                                                                break Label_1626;
                                                            }
                                                            n4 = (0x5962A0A6 ^ n2);
                                                            array11[b10] = icpcyccxvq(nluflzjizdklbiy(), qaiwhiyzxfgbpgw(), n4);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -1612812088) {
                                                                break Label_1415;
                                                            }
                                                            n2 = (0x20C1AC1C ^ n4);
                                                            final String[] array12 = array;
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1714221015) {
                                                                break Label_1626;
                                                            }
                                                            n10 = (0x2F6E46D7 ^ n2);
                                                            final List list = CollectionsKt.listOf((Object[])array12);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n10) == -492755312) {
                                                                final int n11 = 0x78FD8E9 ^ n10;
                                                                this.copyFiles(icpcyccxvq(pppvlhwkegbsywp(), qaiwhiyzxfgbpgw(), n11), file, list, 1619313149);
                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n11) == -555753000) {
                                                                    return;
                                                                }
                                                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n11) != -555753000 || ogwwobatgayyjyld.widdxeioafyswjhq(n11) != (0x6EE99D28 ^ n11)) {}
                                                                throw new IllegalAccessException("double");
                                                            }
                                                        }
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n10) != 1395597601 || ogwwobatgayyjyld.widdxeioafyswjhq(n10) != (0x1A1CD2A8 ^ n10) || ogwwobatgayyjyld.widdxeioafyswjhq(n10) != -492755312 || ogwwobatgayyjyld.widdxeioafyswjhq(n10) != (0x600AA845 ^ n10)) {}
                                                        throw new RuntimeException("double");
                                                    }
                                                    break Label_1415;
                                                }
                                            }
                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n7) != -1421296095 || ogwwobatgayyjyld.widdxeioafyswjhq(n7) != (0x585A7D2D ^ n7) || ogwwobatgayyjyld.widdxeioafyswjhq(n7) != 1499982970 || ogwwobatgayyjyld.widdxeioafyswjhq(n7) != (0x48BDC9DC ^ n7)) {}
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n5) != 1041619266 || ogwwobatgayyjyld.widdxeioafyswjhq(n5) != (0xA865872 ^ n5) || ogwwobatgayyjyld.widdxeioafyswjhq(n5) != -427628245 || ogwwobatgayyjyld.widdxeioafyswjhq(n5) != (0xF3ADF8A ^ n5) || ogwwobatgayyjyld.widdxeioafyswjhq(n5) != 494134816 || ogwwobatgayyjyld.widdxeioafyswjhq(n5) != (0x72875023 ^ n5)) {}
                                throw new IllegalAccessException("double");
                            }
                            break Label_1626;
                        }
                    }
                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -1982464541 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x1DAADA2C ^ n4) || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -1612812088 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x49550B3E ^ n4) || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != -1953371631 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x79E97B7F ^ n4) || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != 1298771595 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x4E659938 ^ n4) || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != 1646085290 || ogwwobatgayyjyld.widdxeioafyswjhq(n4) != (0x50509CCD ^ n4)) {}
                    throw new RuntimeException("double");
                }
                while (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 1336748018 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x13F7CAE8 ^ n3)) {}
                throw new RuntimeException("double");
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1433503106 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x72B36D0C ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -913602272 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x771DFED8 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 68326499 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0xE9A7E46 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -682760390 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0xFBFE7EE ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 431520785 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x7D2D435C ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1714221015 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x30626AD2 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1422620154 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0xF155AA7 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -2066173446 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x51B78698 ^ n2)) {}
        throw new IllegalAccessException();
    }
    
    private final void copyDuelsResources(final int n) {
        int n2 = 0x22AA82E1 ^ (0x6A8E9BE4 ^ 0x6AC03CDB);
        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 388050673) {
            n2 ^= 0x12A5DD4A;
            final File file = new File(icpcyccxvq(fyneffrjczxoiud(), qaiwhiyzxfgbpgw(), n2));
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -2112895839) {
                n2 ^= 0x68CB26CF;
                final String[] array = new String[(byte)(0x588ADE58 ^ n2)];
                array[(byte)(0x588ADE5B ^ n2)] = icpcyccxvq(ybbirxapzidkleb(), qaiwhiyzxfgbpgw(), n2);
                array[(byte)(0x588ADE5A ^ n2)] = icpcyccxvq(orctmxpduymynoz(), qaiwhiyzxfgbpgw(), n2);
                array[(byte)(0x588ADE59 ^ n2)] = icpcyccxvq(ndwwxaznjofrrom(), qaiwhiyzxfgbpgw(), n2);
                final List list = CollectionsKt.listOf((Object[])array);
                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1000934694) {
                    final int n3 = 0x615A891F ^ n2;
                    this.copyFiles(icpcyccxvq(iicccecqjazikmh(), qaiwhiyzxfgbpgw(), n3), file, list, 1619313149);
                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == -830293471) {
                        return;
                    }
                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -830293471 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x3559643E ^ n3)) {}
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 388050673 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x479AD5B0 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -132267734 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x4B82173C ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1000934694 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x503AFF47 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -2112895839 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x2D5BE40E ^ n2)) {}
        throw new RuntimeException();
    }
    
    private final void copyFiles(final String s, final String parent, final File file, final List<String> list) {
        int n = 0xF7320A5 ^ (0x2E345069 ^ 0x6AC03CDB);
        Label_3967: {
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1547329722) {
                n ^= 0x5EF9D055;
            Label_3819:
                while (true) {
                    while (true) {
                        Label_3722: {
                        Label_4221:
                            while (true) {
                                Iterable iterable;
                                byte b;
                                Iterator iterator;
                                Object next;
                                String child;
                                byte b2;
                                int n2;
                                String name = null;
                                File file2 = null;
                                InputStream resourceAsStream;
                                Closeable closeable;
                                Throwable t;
                                InputStream inputStream;
                                byte b3;
                                InputStream in;
                                Path path;
                                CopyOption[] options;
                                Throwable t4;
                                final Throwable t2;
                                Throwable t5;
                                int zirlkruxzkeqwmgp;
                                int n3 = 0;
                                Label_2848:Label_3008_Outer:
                                while (true) {
                                Label_3008:
                                    while (true) {
                                    Label_4105:
                                        while (true) {
                                            Label_2732: {
                                            Label_3427:
                                                while (true) {
                                                    Label_0100: {
                                                        if ((((File)parent).exists() ? 1 : 0) == (0x157E9C42 ^ n)) {
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1410014704) {
                                                                goto Label_0976;
                                                            }
                                                            n ^= 0x58B25C1D;
                                                            ((File)parent).mkdirs();
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1852179194) {
                                                                n ^= 0x12436C00;
                                                                break Label_0100;
                                                            }
                                                            break Label_3967;
                                                        }
                                                        else {
                                                            Label_1884: {
                                                                Label_1876: {
                                                                Label_3925:
                                                                    while (true) {
                                                                        switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                            case 188536261: {
                                                                                continue Label_3008_Outer;
                                                                            }
                                                                            case 161831873: {
                                                                                break Label_1876;
                                                                            }
                                                                            case 2129833623: {
                                                                                break Label_1884;
                                                                            }
                                                                            default: {
                                                                                break Label_3925;
                                                                            }
                                                                        }
                                                                    }
                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -720854038 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x684C1B90 ^ n)) {}
                                                                    throw new IllegalAccessException("double");
                                                                }
                                                                n ^= 0x1085496B;
                                                            }
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 803121480) {
                                                            Label_1968:
                                                                while (true) {
                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                        case 934084792: {
                                                                            break Label_0100;
                                                                        }
                                                                        case 1394361134: {
                                                                            continue Label_3008_Outer;
                                                                        }
                                                                        case 94114349: {
                                                                            break Label_1968;
                                                                        }
                                                                        default: {
                                                                            break Label_2848;
                                                                        }
                                                                    }
                                                                }
                                                                n ^= 0x5A747976;
                                                                break Label_0100;
                                                            }
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 803121480) {
                                                                n = zirlkruxzkeqwmgp(n, 1222370659);
                                                                break Label_3008;
                                                            }
                                                            break Label_4105;
                                                        }
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 185628635 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4C73E3AD ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 190867497 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x70AE64B7 ^ n)) {}
                                                        throw new IllegalAccessException("double");
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1133993592 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x47861468 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -157431574 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x233FC5F5 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1224779920 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6E6052F4 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -343309160 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x2089B0BD ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1466686835 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4353BA71 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -269899046 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6668393C ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 471304322 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x75405FD9 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -383771429 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x3725E431 ^ n)) {}
                                                        throw new IllegalAccessException();
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -58891526 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x25BFA22E ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 488561002 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x25BE5826 ^ n)) {}
                                                        throw new RuntimeException("double");
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1179506921 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7348CAC8 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -817726496 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6EE9A3B1 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -2053335262 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4FAAA97C ^ n)) {}
                                                        throw new RuntimeException("double");
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -400913021 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x41C3A0F9 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1036632880 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x2BFBD629 ^ n)) {}
                                                        throw new IllegalAccessException("double");
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1852517114 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x1BBB1A36 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1071816040 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x285191E5 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -2143735478 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x8EF51F3 ^ n)) {}
                                                        throw new RuntimeException("double");
                                                    }
                                                    iterable = (Iterable)file;
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -58891526) {
                                                        continue Label_3427;
                                                    }
                                                    n ^= 0x77461742;
                                                    b = (byte)(0x28C9BB1D ^ n);
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1179506921) {
                                                        continue Label_3819;
                                                    }
                                                    n ^= 0x55EDB886;
                                                    iterator = iterable.iterator();
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -383771429) {
                                                        continue Label_3008;
                                                    }
                                                    n ^= 0x7556E854;
                                                    if ((iterator.hasNext() ? 1 : 0) != (0x872EBCF ^ n)) {
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1133993592) {
                                                            continue Label_3008;
                                                        }
                                                        n ^= 0x56A152D2;
                                                        next = iterator.next();
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -157431574) {
                                                            continue Label_3008;
                                                        }
                                                        n ^= 0x32E8C46;
                                                        child = (String)next;
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -269899046) {
                                                            continue Label_3008;
                                                        }
                                                        n ^= 0x68DEB7EB;
                                                        b2 = (byte)(0x352382B0 ^ n);
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1457777279) {
                                                            goto Label_1211;
                                                        }
                                                        n2 = (0x3765B91C ^ n);
                                                        name = s + "/" + child;
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 305257824) {
                                                            goto Label_0934;
                                                        }
                                                        n = (0x232A36A9 ^ n2);
                                                        file2 = new File((File)parent, child);
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 190867497) {
                                                            continue Label_2848;
                                                        }
                                                        n ^= 0x7D514AB5;
                                                        if ((file2.exists() ? 1 : 0) == (0x5C3D47B0 ^ n)) {
                                                            goto Label_1018;
                                                        }
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -504742526) {
                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -504742526 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x226A1BAB ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 560602728 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7C98FD83 ^ n)) {}
                                                            throw new IllegalAccessException("double");
                                                        }
                                                        n ^= 0x36D03C1E;
                                                        if (lcmp(file2.length(), 0L) == (0x6AED7BAE ^ n)) {
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1466686835) {
                                                                continue Label_3008;
                                                            }
                                                            n ^= 0x6AB0C90F;
                                                            resourceAsStream = CuyPlugin.class.getClassLoader().getResourceAsStream(name);
                                                            if (resourceAsStream != null) {
                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 49124616) {
                                                                    break Label_4105;
                                                                }
                                                                n ^= 0x43DF43B1;
                                                                closeable = resourceAsStream;
                                                                t = null;
                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 471304322) {
                                                                    n ^= 0x212A3D;
                                                                    Block_23: {
                                                                        Label_2154: {
                                                                            try {
                                                                                inputStream = (InputStream)closeable;
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 488561002) {
                                                                                    continue Label_3427;
                                                                                }
                                                                                n ^= 0x5092240E;
                                                                                b3 = (byte)(0x1331FF23 ^ n);
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1718617832) {
                                                                                    break Label_3722;
                                                                                }
                                                                                n ^= 0x6E32AE93;
                                                                                in = inputStream;
                                                                                path = file2.toPath();
                                                                                options = new CopyOption[(byte)(0x7D0351B1 ^ n)];
                                                                                options[(byte)(0x7D0351B0 ^ n)] = StandardCopyOption.REPLACE_EXISTING;
                                                                                Files.copy(in, path, options);
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -400913021) {
                                                                                    continue Label_4105;
                                                                                }
                                                                                n ^= 0x30CE34EF;
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1852517114) {
                                                                                    continue Label_4221;
                                                                                }
                                                                                n ^= 0x4533206E;
                                                                                CloseableKt.closeFinally(closeable, t);
                                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1207052680) {
                                                                                    break Label_2154;
                                                                                }
                                                                                break Label_4105;
                                                                            }
                                                                            catch (final Throwable t2) {
                                                                                switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n)) {
                                                                                    default: {
                                                                                        throw new IOException("Error in hash");
                                                                                    }
                                                                                    case 488561002: {
                                                                                        n = zirlkruxzkeqwmgp(n, 583128534);
                                                                                        break;
                                                                                    }
                                                                                    case -400913021: {
                                                                                        n = zirlkruxzkeqwmgp(n, 476143435);
                                                                                        break;
                                                                                    }
                                                                                    case -1718617832: {
                                                                                        n = zirlkruxzkeqwmgp(n, 1918104024);
                                                                                        break;
                                                                                    }
                                                                                    case 1852517114: {
                                                                                        n = zirlkruxzkeqwmgp(n, 749693860);
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            catch (final Throwable t3) {
                                                                                switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n)) {
                                                                                    case 488561002: {
                                                                                        n = zirlkruxzkeqwmgp(n, 875456514);
                                                                                        break;
                                                                                    }
                                                                                    case -1718617832: {
                                                                                        n = zirlkruxzkeqwmgp(n, 1690061836);
                                                                                        break;
                                                                                    }
                                                                                    case -400913021: {
                                                                                        n ^= 0xA8EE29F;
                                                                                        break;
                                                                                    }
                                                                                    case 1852517114: {
                                                                                        n ^= 0x3A40D670;
                                                                                        break;
                                                                                    }
                                                                                    default: {
                                                                                        throw new IOException("Error in hash");
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    t4 = t3;
                                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1133667973) {
                                                                                        n ^= 0x7071E082;
                                                                                        t = t4;
                                                                                        throw t4;
                                                                                    }
                                                                                    break Label_4105;
                                                                                }
                                                                                catch (final Throwable t2) {
                                                                                    switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n)) {
                                                                                        default: {
                                                                                            throw new RuntimeException("Error in hash");
                                                                                        }
                                                                                        case -1133667973: {
                                                                                            n ^= 0x16EFBDD4;
                                                                                            break;
                                                                                        }
                                                                                        case 1071816040: {
                                                                                            n = zirlkruxzkeqwmgp(n, 1721654614);
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            break Block_23;
                                                                        }
                                                                    Label_2200:
                                                                        while (true) {
                                                                            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                                case 1986650622: {
                                                                                    continue Label_3008_Outer;
                                                                                }
                                                                                case 23899888: {
                                                                                    break Label_2200;
                                                                                }
                                                                                case 112931797: {
                                                                                    break Label_2732;
                                                                                }
                                                                                default: {
                                                                                    break Label_4105;
                                                                                }
                                                                            }
                                                                        }
                                                                        n ^= 0x11160A4D;
                                                                        break Label_3427;
                                                                    }
                                                                    while (true) {
                                                                        try {
                                                                            t5 = t2;
                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 185628635) {
                                                                                n ^= 0x7C133E68;
                                                                                CloseableKt.closeFinally(closeable, t);
                                                                                throw t5;
                                                                            }
                                                                            continue Label_2848;
                                                                        }
                                                                        catch (final Throwable t2) {
                                                                            switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n)) {
                                                                                case 185628635: {
                                                                                    n ^= (false ? 1 : 0);
                                                                                    continue;
                                                                                }
                                                                                default: {
                                                                                    throw new IllegalAccessException("Error in hash");
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    throw new IOException("Error in hash");
                                                                }
                                                                continue Label_3008;
                                                            }
                                                            else {
                                                                n = zirlkruxzkeqwmgp(n, 2147144026);
                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -46456869) {
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -46456869) {
                                                                        n ^= 0x328753B1;
                                                                        continue Label_3008;
                                                                    }
                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -46456869 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x50708ABB ^ n)) {}
                                                                    throw new IOException("double");
                                                                }
                                                                else {
                                                                    n = zirlkruxzkeqwmgp(n, 94606985);
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -802706541) {
                                                                        break Label_3967;
                                                                    }
                                                                    n ^= 0x7DBDCD14;
                                                                    this.logger.warning("Could not find resource " + name);
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1036632880) {
                                                                        n ^= 0x57BE1E4F;
                                                                        break Label_2848;
                                                                    }
                                                                    continue Label_4105;
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            n = zirlkruxzkeqwmgp(n, 196732998);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 178560835) {
                                                            Label_3416:
                                                                while (true) {
                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                        case 2146375169: {
                                                                            continue Label_3008_Outer;
                                                                        }
                                                                        case 211009477: {
                                                                            break Label_3416;
                                                                        }
                                                                        default: {
                                                                            continue Label_3427;
                                                                        }
                                                                        case 553704196: {
                                                                            break Label_2848;
                                                                        }
                                                                    }
                                                                }
                                                                n ^= 0x3153B5C1;
                                                                break Label_2848;
                                                            }
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 178560835) {
                                                            Label_3000:
                                                                while (true) {
                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                        case 1546756462: {
                                                                            continue Label_3008_Outer;
                                                                        }
                                                                        case 211009477: {
                                                                            break Label_3000;
                                                                        }
                                                                        case 73570978: {
                                                                            continue Label_3008;
                                                                        }
                                                                        default: {
                                                                            break Label_3967;
                                                                        }
                                                                    }
                                                                }
                                                                n ^= 0x2C74A3A2;
                                                                continue Label_3008;
                                                            }
                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 178560835 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4595D367 ^ n)) {}
                                                            throw new RuntimeException("double");
                                                        }
                                                    }
                                                    else {
                                                        Label_1624: {
                                                        Label_1616:
                                                            while (true) {
                                                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                    case 734359620: {
                                                                        continue Label_3008_Outer;
                                                                    }
                                                                    case 6201491: {
                                                                        break Label_1616;
                                                                    }
                                                                    case 956075055: {
                                                                        break Label_1624;
                                                                    }
                                                                    default: {
                                                                        continue Label_3819;
                                                                    }
                                                                }
                                                            }
                                                            n ^= 0xAA33A5F;
                                                        }
                                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 378440832) {
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 378440832) {
                                                            Label_1692:
                                                                while (true) {
                                                                    switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                        case 807073277: {
                                                                            continue Label_3008_Outer;
                                                                        }
                                                                        case 44349094: {
                                                                            break Label_1692;
                                                                        }
                                                                        default: {
                                                                            break Label_2732;
                                                                        }
                                                                        case 1867634232: {
                                                                            continue Label_3008;
                                                                        }
                                                                    }
                                                                }
                                                                n ^= 0x4FF1E1DA;
                                                                continue Label_3008;
                                                            }
                                                            break Label_4105;
                                                        }
                                                        else {
                                                            zirlkruxzkeqwmgp = zirlkruxzkeqwmgp(n, 1751186398);
                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) == 1435062899) {
                                                                return;
                                                            }
                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != 1435062899 || ogwwobatgayyjyld.widdxeioafyswjhq(zirlkruxzkeqwmgp) != (0x123AC54A ^ zirlkruxzkeqwmgp)) {}
                                                            throw new IOException("double");
                                                        }
                                                    }
                                                    break;
                                                }
                                                try {
                                                    if (ogwwobatgayyjyld.yphcfoidvruxcacx(n) != 36832232) {
                                                        throw null;
                                                    }
                                                    throw new RuntimeException();
                                                    iftrue(Label_2251:)(ogwwobatgayyjyld.widdxeioafyswjhq(n) != 49124616 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7463A831 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1207052680 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6DCB96B6 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1133667973 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x3A0DE992 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 702842288 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x26677661 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 378440832 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x5E760F69 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 803121480 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x3CAC70CD ^ n));
                                                    throw new IOException("double");
                                                }
                                                catch (final RuntimeException ex) {
                                                    switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n)) {
                                                        default: {
                                                            throw new RuntimeException("Error in hash");
                                                        }
                                                        case -817726496: {
                                                            n3 = (0x33A35244 ^ n);
                                                            break;
                                                        }
                                                        case 702842288: {
                                                            n3 = (0x2F778D8E ^ n);
                                                            break;
                                                        }
                                                    }
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 1381558721) {
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 1381558721 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x25AF68D9 ^ n3)) {}
                                                        throw new RuntimeException("double");
                                                    }
                                                    n = (0x5F7FE230 ^ n3);
                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1448609725) {
                                                        Label_2600: {
                                                        Block_127:
                                                            while (true) {
                                                                switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                                                                    case 1648940888: {
                                                                        continue Label_3008_Outer;
                                                                    }
                                                                    case 51829547: {
                                                                        n ^= 0x6EBBCE89;
                                                                        break Block_127;
                                                                    }
                                                                    case 1312361061: {
                                                                        break Label_2600;
                                                                    }
                                                                    default: {
                                                                        continue Label_4105;
                                                                    }
                                                                }
                                                            }
                                                            try {
                                                                if (ogwwobatgayyjyld.yphcfoidvruxcacx(n) != 90535014) {
                                                                    throw null;
                                                                }
                                                                throw new IOException();
                                                            }
                                                            catch (final IOException ex2) {
                                                                switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n)) {
                                                                    case -596014072: {
                                                                        n ^= 0xD50DB6F;
                                                                        break;
                                                                    }
                                                                    case -762157295: {
                                                                        n = zirlkruxzkeqwmgp(n, 747480588);
                                                                        break;
                                                                    }
                                                                    default: {
                                                                        throw new RuntimeException("Error in hash");
                                                                    }
                                                                }
                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1224779920) {
                                                                    n = zirlkruxzkeqwmgp(n, 1188613319);
                                                                    break Label_2848;
                                                                }
                                                                continue Label_3008;
                                                            }
                                                        }
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -596014072 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x3B6A445A ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -762157295 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x2EFF3A61 ^ n)) {}
                                                        throw new IOException("double");
                                                    }
                                                    break Label_3967;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    continue Label_2848;
                                }
                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -2143735478) {
                                    continue Label_4221;
                                }
                                break;
                            }
                            n = (0x2C928E06 ^ (0x8201665 ^ n));
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1515326893) {
                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1515326893 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x5CBEA15B ^ n)) {}
                                throw new IllegalAccessException("double");
                            }
                            final int n4 = 0x24062CAE ^ n;
                            try {
                                if (ogwwobatgayyjyld.yphcfoidvruxcacx(n4) != 207338538) {
                                    throw null;
                                }
                                throw new IOException();
                            }
                            catch (final IOException ex3) {
                                switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n4)) {
                                    case -720854038: {
                                        n = (0x69808888 ^ n4);
                                        break;
                                    }
                                    case -2053335262: {
                                        n = (0x63920E11 ^ n4);
                                        break;
                                    }
                                    default: {
                                        throw new RuntimeException("Error in hash");
                                    }
                                }
                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1727207511) {
                                    n = zirlkruxzkeqwmgp(n, 995325754);
                                    continue;
                                }
                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1727207511 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7A974039 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1718617832 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x15FCBA27 ^ n)) {}
                                throw new IllegalAccessException("double");
                            }
                        }
                        break;
                    }
                    continue Label_3819;
                }
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1852179194 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x3A24297 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1547329722 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x39C4A432 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -802706541 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x1FFBD6D ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1448609725 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x7DC4D100 ^ n)) {}
        throw new IllegalAccessException("double");
    }
    
    static {
        (ResourceManager.nothing_to_see_here = new String[17])[0] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e0\u28e4\u28f6\u28f6\u28f6\u28e4\u28c4\u28c0\u28c0\u2804\u2804\u2804\u2804\u2804";
        ResourceManager.nothing_to_see_here[1] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e4\u28e4\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28df\u28bf\u28ff\u28ff\u28ff\u28f6\u28e4\u2840\u2804";
        ResourceManager.nothing_to_see_here[2] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2880\u28fc\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u283f\u283f\u28ff\u28ff\u28e7\u2893";
        ResourceManager.nothing_to_see_here[3] = "\u2804\u2804\u2804\u2804\u2804\u2860\u289b\u28ff\u28ff\u28ff\u285f\u28ff\u28ff\u28fd\u28cb\u283b\u28bb\u28ff\u28ff\u28ff\u28ff\u287b\u28e7\u2860\u28ed\u28ed\u28ff\u2867";
        ResourceManager.nothing_to_see_here[4] = "\u2804\u2804\u2804\u2804\u2804\u28a0\u28ff\u285f\u28ff\u28bb\u2803\u28fb\u28e8\u28fb\u283f\u2840\u28dd\u287f\u28ff\u28ff\u28f7\u28dc\u28dc\u28bf\u28dd\u287f\u287b\u2894";
        ResourceManager.nothing_to_see_here[5] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u285f\u28f7\u28bf\u2888\u28da\u28d3\u2861\u28fb\u28ff\u28f6\u28ec\u28db\u28d3\u28c9\u287b\u28bf\u28ce\u2822\u283b\u28f4\u287e\u282b";
        ResourceManager.nothing_to_see_here[6] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u2803\u28b9\u287c\u28b8\u28ff\u28ff\u28ff\u28e6\u28f9\u28ff\u28ff\u28ff\u283f\u283f\u283f\u2837\u28ce\u287c\u2806\u28ff\u2835\u28eb";
        ResourceManager.nothing_to_see_here[7] = "\u2804\u2804\u2804\u2804\u2804\u2808\u2804\u2838\u285f\u285c\u28e9\u2844\u2804\u28ff\u28ff\u28ff\u28ff\u28f6\u2880\u2880\u28ff\u28f7\u28ff\u28ff\u2850\u2847\u2844\u28ff";
        ResourceManager.nothing_to_see_here[8] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2801\u28b6\u28bb\u28e7\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28ff\u28c7\u285f\u28c7\u28f7\u28ff";
        ResourceManager.nothing_to_see_here[9] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28c6\u28e4\u28fd\u28ff\u287f\u283f\u283f\u28ff\u28ff\u28e6\u28f4\u2847\u28ff\u28a8\u28fe\u28ff\u28b9\u28b8";
        ResourceManager.nothing_to_see_here[10] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28ff\u280a\u285b\u28bf\u28ff\u28ff\u28ff\u28ff\u287f\u28eb\u28b1\u28ba\u2847\u284f\u28ff\u28ff\u28f8\u287c";
        ResourceManager.nothing_to_see_here[11] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u287f\u2804\u28ff\u28f7\u28fe\u284d\u28ed\u28f6\u28ff\u28ff\u284c\u28fc\u28f9\u28b1\u2839\u28ff\u28c7\u28e7";
        ResourceManager.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28fc\u2801\u28e4\u28ed\u28ed\u284c\u2881\u28fc\u28ff\u28ff\u28ff\u28b9\u2847\u28ed\u28e4\u28f6\u28e4\u285d\u287c";
        ResourceManager.nothing_to_see_here[13] = "\u2804\u28c0\u2824\u2840\u2804\u2804\u2804\u2804\u2804\u284f\u28c8\u287b\u287f\u2803\u2880\u28fe\u28ff\u28ff\u28ff\u287f\u287c\u2801\u28ff\u28ff\u28ff\u287f\u28b7\u28b8";
        ResourceManager.nothing_to_see_here[14] = "\u28b0\u28f7\u2867\u2862\u2804\u2804\u2804\u2804\u2820\u28a0\u285b\u283f\u2804\u2820\u282c\u283f\u28ff\u282d\u282d\u28b1\u28c7\u28c0\u28ed\u2845\u2836\u28fe\u28f7\u28f6";
        ResourceManager.nothing_to_see_here[15] = "\u2808\u28bf\u28ff\u28e7\u2804\u2804\u2804\u2804\u2880\u285b\u283f\u2804\u2804\u2804\u2804\u28a0\u2803\u2804\u2804\u285c\u2804\u2804\u28e4\u2880\u28f6\u28ee\u284d\u28f4";
        ResourceManager.nothing_to_see_here[16] = "\u2804\u2808\u28ff\u28ff\u2840\u2804\u2804\u2804\u28a9\u28dd\u2803\u2804\u2804\u2880\u2844\u284e\u2804\u2804\u2804\u2807\u2804\u2804\u2805\u28f4\u28f6\u28f6\u2804\u28f6";
        ResourceManager.PAkNCM5YrH = (0x4BE7B8D1 ^ new Random(5992553598611156684L).nextInt());
    }
    
    public static String icpcyccxvq(final byte[] bytes, final byte[] array, final int i) {
        final byte[] bytes2 = Integer.toString(i).getBytes();
        for (int j = 0; j < bytes.length; ++j) {
            final int n = j;
            bytes[n] ^= bytes2[j % bytes2.length];
            final int n2 = j;
            bytes[n2] ^= array[j % array.length];
        }
        return new String(bytes, StandardCharsets.UTF_16);
    }
    
    private static byte[] qaiwhiyzxfgbpgw() {
        return new byte[] { 114, 109, 99, 34, 89, 86, 93, 101, 120, 19, 89, 51, 3, 61, 34, 56, 42, 100, 117, 113, 1, 95, 9, 108, 6, 46, 74, 71, 57, 7, 66, 75, 22, 45, 30, 24, 49, 31, 29, 104, 107, 120, 81, 124, 95, 122, 34, 65, 103, 52, 119, 74, 3, 87, 48, 114, 90 };
    }
    
    private static byte[] lfrhfagcmkmyvqt() {
        return new byte[] { -75, -94, 85, 96, 111, 16, 110, 57, 76, 78, 105, 112, 49, 104, 22, 127, 25, 30, 76, 32, 55, 0, 63, 61 };
    }
    
    private static byte[] xbetfufsbpbppbu() {
        return new byte[] { -67, -93, 86, 127, 104, 3, 104, 56, 76, 68, 104, 109, 54, 104, 19, 119 };
    }
    
    private static byte[] sybzfxevuvylgic() {
        return new byte[] { -67, -90, 90, 113, 110, 16, 107, 55, 79, 71, 104, 116 };
    }
    
    private static byte[] zprtkjdnjruagsw() {
        return new byte[] { -76, -94, 84, 103, 107, 12, 111, 28, 74, 68, 105, 115, 50, 106, 23, 120, 31, 21, 77, 32, 54, 29, 59, 60, 52, 51, 120, 81, 9, 30, 115, 87, 35, 54 };
    }
    
    private static byte[] xpnfshjonesuspy() {
        return new byte[] { -67, -95, 86, 99, 106, 10, 108, 58, 77, 86, 104, 46, 54, 118, 17, 97, 27, 56 };
    }
    
    private static byte[] lwnoaqwcxuutnib() {
        return new byte[] { -71, -85, 83, 121, 104, 8, 109, 58, 72, 64, 96, 106, 59, 107, 19, 38, 27, 45, 64, 37, 49, 11 };
    }
    
    private static byte[] uxzzdcacdnkjlcd() {
        return new byte[] { -67, -96, 84, 121, 108, 15, 111, 61, 64, 74, 104, 103, 52, 107, 23, 122, 24, 52, 77, 106, 48, 20, 62, 56, 51, 114 };
    }
    
    private static byte[] zlwusjidxellnje() {
        return new byte[] { -67, -96, 85, 126, 107, 0, 100, 61, 65, 83, 104, 114, 53, 34, 16, 114, 19, 63, 76, 40 };
    }
    
    private static byte[] qswawvkksfhxmqu() {
        return new byte[] { -66, -94, 90, 123, 105, 0, 109, 39, 73, 87, 107, 98, 58, 110, 18, 110, 26, 38, 68, 104, 51, 22, 48, 53, 54, 113 };
    }
    
    private static byte[] aflaoiebtshhsgq() {
        return new byte[] { -67, -96, 86, 99, 96, 7, 100, 61, 73, 83, 104, 100, 54, 109, 27, 101, 19, 50, 68, 49, 48, 9, 60, 112, 63, 101, 115, 29, 8, 89 };
    }
    
    private static byte[] bhvnczuugzrmdxx() {
        return new byte[] { -69, -93, 82, 99, 107, 18, 107, 36, 74, 10, 104, 123, 48, 98, 18, 98 };
    }
    
    private static byte[] nluflzjizdklbiy() {
        return new byte[] { -65, -95, 86, 103, 111, 0, 105, 39, 73, 84, 106, 110, 49, 37, 27, 117, 26, 56, 70, 46 };
    }
    
    private static byte[] ndolntwslrkbhqt() {
        return new byte[] { -76, -85, 85, 118, 110, 10, 101, 53, 74, 95, 96, 109, 51, 39, 27, 109, 27, 51, 77, 59, 55, 28, 62, 52, 62, 120, 120, 26, 0, 66, 114, 82, 47, 108, 47, 71, 9, 74 };
    }
    
    private static byte[] qzqrcutydtlltlg() {
        return new byte[] { -67, -96, 87, 98, 97, 9, 104, 35, 74, 66, 104, 104, 55, 99, 26, 120, 31, 120, 71, 2, 48, 14, 61, 51, 62, 115, 127, 27, 11, 92, 115, 0 };
    }
    
    private static byte[] pppvlhwkegbsywp() {
        return new byte[] { -72, -92, 84, 115, 105, 4, 106, 50, 79, 73, 111, 107, 55, 96, 19, 118 };
    }
    
    private static byte[] weuzqyipjhmakuu() {
        return new byte[] { -67, -90, 86, 114, 97, 3, 104, 36, 64, 69, 104, 101, 54, 104, 26, 127, 31, 52, 77, 104, 48, 18, 60, 53, 62, 118 };
    }
    
    private static byte[] pbhzzmidacqojxv() {
        return new byte[] { -67, -86, 90, 104, 111, 14, 104, 37, 64, 77, 104, 111, 58, 119, 20, 33, 31, 40, 77, 44, 48, 11 };
    }
    
    private static byte[] fyneffrjczxoiud() {
        return new byte[] { -76, -94, 90, 100, 107, 3, 101, 36, 76, 76, 105, 99, 53, 97, 27, 115, 30, 127, 77, 5, 56, 6, 59, 59, 62, 111, 126, 11, 9, 122, 116, 12, 47, 112, 42, 64, 9, 92 };
    }
    
    private static byte[] ybbirxapzidkleb() {
        return new byte[] { -67, -90, 91, 116, 109, 0, 104, 51, 65, 76, 104, 110, 59, 111, 22, 47, 31, 37, 76, 37, 48, 7 };
    }
    
    private static byte[] orctmxpduymynoz() {
        return new byte[] { -67, -90, 91, 115, 109, 14, 104, 41, 65, 75, 104, 101, 59, 105, 22, 114, 31, 57, 76, 102, 48, 18, 49, 52, 50, 123 };
    }
    
    private static byte[] ndwwxaznjofrrom() {
        return new byte[] { -67, -90, 91, 122, 109, 10, 104, 51, 65, 95, 104, 116, 59, 38, 22, 120, 31, 49, 76, 36 };
    }
    
    private static byte[] iicccecqjazikmh() {
        return new byte[] { -75, -92, 90, 127, 108, 22, 108, 52, 72, 70, 111, 121 };
    }
    
    private static int zirlkruxzkeqwmgp(final int n, final int n2) {
        return n ^ n2;
    }
}
