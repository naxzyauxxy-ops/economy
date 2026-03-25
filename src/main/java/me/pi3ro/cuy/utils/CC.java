// 
// Decompiled by Procyon v0.6.0
// 

package me.pi3ro.cuy.utils;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.Nullable;
import java.util.regex.Matcher;
import net.md_5.bungee.api.ChatColor;
import kotlin.text.StringsKt;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import dbjrsyajbkgezbtp.ogwwobatgayyjyld;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.Metadata;

@Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B	\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020\bJ\u0010\u0010
                                                   \u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0004\u001a
                                                    \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006""" }, d2 = { "Lme/pi3ro/cuy/utils/CC;", "", "<init>", "()V", "hexPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "translate", "", "text", "console", "", "msg", "cuy-plugin" })
@SourceDebugExtension({ """
                        SMAP
                        CC.kt
                        Kotlin
                        *S Kotlin
                        *F
                        + 1 CC.kt
                        me/pi3ro/cuy/utils/CC
                        + 2 fake.kt
                        kotlin/jvm/internal/FakeKt
                        *L
                        1#1,37:1
                        1#2:38
                        *E
                        """ })
public final class CC
{
    @NotNull
    public static final CC INSTANCE;
    private static final Pattern hexPattern;
    private static int EkojHsbPYV = 0;
    private transient int wqJpuHy4lU = 1488034403;
    private static byte[] lggbkkvkyp;
    private static String[] nothing_to_see_here;
    
    private CC() {
        final int n = 0x7C31ABCB ^ 0x4213AA6C;
        jovunlqhyttuctam(n, 490991729);
        final int n2 = 0x41ABA468 ^ (0x687F41C6 ^ Integer.parseInt("179639416"));
    }
    
    @NotNull
    public final String translate(@NotNull final String s, final int n) {
        int n2 = 0x113AEA4B ^ (0x395B415B ^ 0x772002B5);
        Label_2010: {
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -99791574) {
                n2 ^= 0x69FB69A2;
                Intrinsics.checkNotNullParameter((Object)s, kpabwivgnf(yugstlglspilspm(), n2));
                Label_1289: {
                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1244266439) {
                        n2 ^= 0x59330156;
                        String s2 = s;
                        Label_1802: {
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 2085489291) {
                                n2 ^= 0x468CB78C;
                                final Matcher matcher = CC.hexPattern.matcher(s2);
                            Label_1699:
                                while (true) {
                                Label_0132:
                                    while (true) {
                                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 1210824425) {
                                            n2 ^= 0x3E88DCCD;
                                            break Label_0132;
                                        }
                                        Label_1452: {
                                            Block_20: {
                                                Label_1937: {
                                                    Label_1397: {
                                                        Label_0749: {
                                                            break Label_0749;
                                                            while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1260838259 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x50C3B049 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -168159007 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x66712430 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1182296445 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x734E4C30 ^ n2)) {}
                                                            throw new IOException("double");
                                                            Label_0561: {
                                                                if ((matcher.find() ? 1 : 0) == (0x178DAA10 ^ n2)) {
                                                                    break Label_0561;
                                                                }
                                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1133686656) {
                                                                    break Label_1452;
                                                                }
                                                                n2 ^= 0x18CE90B9;
                                                                try {
                                                                    n2 ^= 0x6627E107;
                                                                    final String group = matcher.group();
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1260838259) {
                                                                        continue Label_1699;
                                                                    }
                                                                    n2 ^= 0x4D13C2C2;
                                                                    Intrinsics.checkNotNull((Object)group);
                                                                    final String s3 = group;
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 599313249) {
                                                                        break Label_1802;
                                                                    }
                                                                    n2 ^= 0x260AEFE4;
                                                                    final String replace$default = StringsKt.replace$default(s3, kpabwivgnf(adurboiiygzqtbv(), n2), kpabwivgnf(zxsbwtfvskykjdv(), n2), (boolean)((byte)(0x27DF688 ^ n2) != 0), (int)(byte)(0x27DF68C ^ n2), (Object)null);
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 334476352) {
                                                                        break Label_1937;
                                                                    }
                                                                    n2 ^= 0x79A02DC8;
                                                                    final String replace$default2 = StringsKt.replace$default(replace$default, kpabwivgnf(sawqgloeugtdfef(), n2), kpabwivgnf(dgsqxablmtmwngc(), n2), (boolean)((byte)(0x7BDDDB40 ^ n2) != 0), (int)(byte)(0x7BDDDB44 ^ n2), (Object)null);
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -554771965) {
                                                                        break Label_2010;
                                                                    }
                                                                    n2 ^= 0x60F530CB;
                                                                    final String s4 = replace$default2;
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -649634728) {
                                                                        break Label_1289;
                                                                    }
                                                                    n2 ^= 0x2197ADB9;
                                                                    final ChatColor of = ChatColor.of(s4);
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -705023599) {
                                                                        break Label_0749;
                                                                    }
                                                                    n2 ^= 0x61FB70F2;
                                                                    final String s5 = s2;
                                                                    final String s6 = group;
                                                                    final String string = of.toString();
                                                                    Intrinsics.checkNotNullExpressionValue((Object)string, kpabwivgnf(tcbvvinczzwsbgs(), n2));
                                                                    final String replace$default3 = StringsKt.replace$default(s5, s6, string, (boolean)((byte)(0x5B4436C0 ^ n2) != 0), (int)(byte)(0x5B4436C4 ^ n2), (Object)null);
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -635324926) {
                                                                        break Label_1802;
                                                                    }
                                                                    n2 ^= 0x2FF644A5;
                                                                    s2 = replace$default3;
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1517055189) {
                                                                        break Label_0749;
                                                                    }
                                                                    n2 ^= 0x533A5261;
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 1010892833) {
                                                                        break Label_1397;
                                                                    }
                                                                    break Label_0749;
                                                                    while (true) {
                                                                        Block_55: {
                                                                            Label_0654: {
                                                                                break Label_0654;
                                                                                Label_0710: {
                                                                                    iftrue(Label_0710:)(ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 488120043 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x59F8F895 ^ n2));
                                                                                }
                                                                                throw new IOException("double");
                                                                                n2 = jovunlqhyttuctam(n2, 1949215181);
                                                                                iftrue(Label_0593:)(ogwwobatgayyjyld.widdxeioafyswjhq(n2) == 488120043);
                                                                                break Block_55;
                                                                                Label_0700:
                                                                                n2 ^= 0x2C6CEFD3;
                                                                                break Label_1289;
                                                                            }
                                                                            switch([Lcom.strobel.decompiler.ast.Label;@47d7e1ea)(ogwwobatgayyjyld.yphcfoidvruxcacx(n2));
                                                                            Label_0593: {
                                                                                n2 = jovunlqhyttuctam(n2, 1562132673);
                                                                            }
                                                                            final String translateAlternateColorCodes = org.bukkit.ChatColor.translateAlternateColorCodes((char)(byte)(0x3EBF433A ^ n2), s2);
                                                                            Intrinsics.checkNotNullExpressionValue((Object)translateAlternateColorCodes, kpabwivgnf(eslvoicthjigled(), n2));
                                                                            return translateAlternateColorCodes;
                                                                            iftrue(Label_0749:)(ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1210824425 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x5854D6D1 ^ n2));
                                                                            throw new RuntimeException("double");
                                                                        }
                                                                        iftrue(Label_0710:)(ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 488120043);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (final Exception ex) {
                                                                    int n3 = 0;
                                                                    switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n2)) {
                                                                        case 1260838259: {
                                                                            n3 = jovunlqhyttuctam(n2, 134489094);
                                                                            break;
                                                                        }
                                                                        case 2048513352: {
                                                                            n3 = (0x6E23C501 ^ n2);
                                                                            break;
                                                                        }
                                                                        case -649634728: {
                                                                            n3 = jovunlqhyttuctam(n2, 2051544099);
                                                                            break;
                                                                        }
                                                                        case 599313249: {
                                                                            n3 = jovunlqhyttuctam(n2, 1159194308);
                                                                            break;
                                                                        }
                                                                        case -705023599: {
                                                                            n3 = jovunlqhyttuctam(n2, 1541388698);
                                                                            break;
                                                                        }
                                                                        default: {
                                                                            throw new IOException("Error in hash");
                                                                        }
                                                                        case -554771965: {
                                                                            n3 = (0x1ABD24E8 ^ n2);
                                                                            break;
                                                                        }
                                                                        case 334476352: {
                                                                            n3 = (0x631D0920 ^ n2);
                                                                            break;
                                                                        }
                                                                        case -635324926: {
                                                                            n3 = (0x3A24C968 ^ n2);
                                                                            break;
                                                                        }
                                                                        case -1517055189: {
                                                                            n3 = (0x15D28DCD ^ n2);
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == 185072963) {
                                                                        final int n4 = 0x16500D78 ^ n3;
                                                                        try {
                                                                            if (ogwwobatgayyjyld.yphcfoidvruxcacx(n4) != 116302147) {
                                                                                throw null;
                                                                            }
                                                                            throw new IllegalAccessException();
                                                                        }
                                                                        catch (final IllegalAccessException ex2) {
                                                                            switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n4)) {
                                                                                case -1182296445: {
                                                                                    n3 = (0x3F7305FB ^ n4);
                                                                                    break;
                                                                                }
                                                                                case -2067552127: {
                                                                                    n3 = (0x78DB823B ^ n4);
                                                                                    break;
                                                                                }
                                                                                default: {
                                                                                    throw new IOException("Error in hash");
                                                                                }
                                                                            }
                                                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == 1109375322) {
                                                                                n2 = (0x5FCE5D3B ^ n3);
                                                                                continue Label_0132;
                                                                            }
                                                                        }
                                                                    }
                                                                    while (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 185072963 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x36732329 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 1109375322 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x565AF535 ^ n3)) {}
                                                                    throw new RuntimeException("double");
                                                                }
                                                            }
                                                        }
                                                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1517055189 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x4E87CD ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 1010892833 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x5F070566 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -705023599 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x2BCF207E ^ n2)) {}
                                                        throw new RuntimeException("double");
                                                    }
                                                Label_1444:
                                                    while (true) {
                                                        switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                            case 1393950078: {
                                                                continue;
                                                            }
                                                            case 211261839: {
                                                                break Label_1444;
                                                            }
                                                            case 1703941483: {
                                                                break Label_1452;
                                                            }
                                                            default: {
                                                                break Label_2010;
                                                            }
                                                        }
                                                    }
                                                    n2 ^= 0x616C8A1D;
                                                    break Block_20;
                                                }
                                                while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 525944505 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x294518A5 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 334476352 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x799996BE ^ n2)) {}
                                                throw new RuntimeException("double");
                                            }
                                            try {
                                                if (ogwwobatgayyjyld.yphcfoidvruxcacx(n2) != 156979060) {
                                                    throw null;
                                                }
                                                throw new RuntimeException();
                                                iftrue(Label_1495:)(ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 925192394 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x765CE128 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1133686656 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x5D345FFB ^ n2));
                                                throw new IOException("double");
                                            }
                                            catch (final RuntimeException ex3) {
                                                switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n2)) {
                                                    case 525944505: {
                                                        n2 ^= 0x1DA968F2;
                                                        break;
                                                    }
                                                    default: {
                                                        throw new IllegalAccessException("Error in hash");
                                                    }
                                                    case 925192394: {
                                                        n2 ^= 0x78A6EA3C;
                                                        break;
                                                    }
                                                }
                                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -233701079) {
                                                Label_1688:
                                                    while (true) {
                                                        switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                                                            case 1038537749: {
                                                                continue Label_0132;
                                                            }
                                                            case 1918651688: {
                                                                continue;
                                                            }
                                                            case 144728581: {
                                                                break Label_1688;
                                                            }
                                                            default: {
                                                                continue Label_1699;
                                                            }
                                                        }
                                                    }
                                                    n2 ^= 0x29CFEA35;
                                                    continue Label_0132;
                                                }
                                                break Label_1802;
                                            }
                                        }
                                        break;
                                    }
                                    continue Label_1699;
                                }
                            }
                        }
                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 599313249 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x7CA44274 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 2085489291 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0xB3EE03D ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -635324926 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x34B099 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -233701079 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x7E1CEF05 ^ n2)) {}
                        throw new RuntimeException("double");
                    }
                }
                while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -649634728 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x1D5F1152 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -2067552127 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x6389136F ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1244266439 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x7C58A3CB ^ n2)) {}
                throw new IllegalAccessException();
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -554771965 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x51B23B5B ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -99791574 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x4EB7F000 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != 2122276978 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x5639E1BC ^ n2)) {}
        throw new IOException("double");
    }
    
    public final void console(@Nullable final String s, final int n) {
        int n2 = 0x51EE8D9 ^ (0x4789ABF8 ^ 0x772002B5);
        Label_0787: {
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) == -1380315999) {
                n2 ^= 0x7E9360C;
                while (true) {
                    Label_0322: {
                        if (s == null) {
                            break Label_0322;
                        }
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1829520191) {
                            break Label_0787;
                        }
                        int n3 = 0x1302FB25 ^ n2;
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == 182740457) {
                            n3 ^= 0xB54F42E;
                            final byte b = (byte)(0x2A087893 ^ n3);
                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == 1346618521) {
                                n3 ^= 0x79936D1B;
                                Bukkit.getServer().getConsoleSender().sendMessage(CC.INSTANCE.translate(s, 1306455250));
                                if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == -1663521726) {
                                    n3 ^= 0x2C10BD0;
                                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == -1966017854) {
                                        final int n4 = 0x58B65870 ^ n3;
                                        try {
                                            if (ogwwobatgayyjyld.yphcfoidvruxcacx(n4) != 54119937) {
                                                throw null;
                                            }
                                            throw new IOException();
                                        }
                                        catch (final IOException ex) {
                                            switch (ogwwobatgayyjyld.gicktsuzorogcxcs(n4)) {
                                                default: {
                                                    throw new RuntimeException("Error in hash");
                                                }
                                                case 1331835200: {
                                                    n3 = (0x7548BB55 ^ n4);
                                                    break;
                                                }
                                                case -34905703: {
                                                    n3 = jovunlqhyttuctam(n4, 1125749070);
                                                    break;
                                                }
                                            }
                                            if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == -450368533) {
                                                return;
                                            }
                                            break Label_0480;
                                        }
                                        break Label_0322;
                                    }
                                }
                            }
                        }
                        while (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -61822744 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x1C30ED24 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -1966017854 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x62405E12 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 16562787 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x74709181 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 1331835200 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x4CFDE581 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -450368533 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0xA72B4B9 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 1346618521 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x408269DD ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -481031437 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x15275A52 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -1663521726 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x687B7921 ^ n3) || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 182740457 || ogwwobatgayyjyld.widdxeioafyswjhq(n3) != (0x64C8A4F8 ^ n3)) {}
                        throw new RuntimeException();
                    }
                    int n3 = 0x2DD46285 ^ n2;
                    if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != -61822744) {
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) == -61822744) {
                            n3 = jovunlqhyttuctam(n3, 1675662403);
                        }
                        continue;
                    }
                    else {
                        n3 = jovunlqhyttuctam(n3, 2140504657);
                        if (ogwwobatgayyjyld.widdxeioafyswjhq(n3) != 16562787) {
                            continue;
                        }
                    }
                    break;
                }
                return;
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1829520191 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x79626339 ^ n2) || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != -1380315999 || ogwwobatgayyjyld.widdxeioafyswjhq(n2) != (0x42CB5AAD ^ n2)) {}
        throw new IllegalAccessException("double");
    }
    
    static {
        (CC.nothing_to_see_here = new String[17])[0] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e0\u28e4\u28f6\u28f6\u28f6\u28e4\u28c4\u28c0\u28c0\u2804\u2804\u2804\u2804\u2804";
        CC.nothing_to_see_here[1] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e4\u28e4\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28df\u28bf\u28ff\u28ff\u28ff\u28f6\u28e4\u2840\u2804";
        CC.nothing_to_see_here[2] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2880\u28fc\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u283f\u283f\u28ff\u28ff\u28e7\u2893";
        CC.nothing_to_see_here[3] = "\u2804\u2804\u2804\u2804\u2804\u2860\u289b\u28ff\u28ff\u28ff\u285f\u28ff\u28ff\u28fd\u28cb\u283b\u28bb\u28ff\u28ff\u28ff\u28ff\u287b\u28e7\u2860\u28ed\u28ed\u28ff\u2867";
        CC.nothing_to_see_here[4] = "\u2804\u2804\u2804\u2804\u2804\u28a0\u28ff\u285f\u28ff\u28bb\u2803\u28fb\u28e8\u28fb\u283f\u2840\u28dd\u287f\u28ff\u28ff\u28f7\u28dc\u28dc\u28bf\u28dd\u287f\u287b\u2894";
        CC.nothing_to_see_here[5] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u285f\u28f7\u28bf\u2888\u28da\u28d3\u2861\u28fb\u28ff\u28f6\u28ec\u28db\u28d3\u28c9\u287b\u28bf\u28ce\u2822\u283b\u28f4\u287e\u282b";
        CC.nothing_to_see_here[6] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u2803\u28b9\u287c\u28b8\u28ff\u28ff\u28ff\u28e6\u28f9\u28ff\u28ff\u28ff\u283f\u283f\u283f\u2837\u28ce\u287c\u2806\u28ff\u2835\u28eb";
        CC.nothing_to_see_here[7] = "\u2804\u2804\u2804\u2804\u2804\u2808\u2804\u2838\u285f\u285c\u28e9\u2844\u2804\u28ff\u28ff\u28ff\u28ff\u28f6\u2880\u2880\u28ff\u28f7\u28ff\u28ff\u2850\u2847\u2844\u28ff";
        CC.nothing_to_see_here[8] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2801\u28b6\u28bb\u28e7\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28ff\u28c7\u285f\u28c7\u28f7\u28ff";
        CC.nothing_to_see_here[9] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28c6\u28e4\u28fd\u28ff\u287f\u283f\u283f\u28ff\u28ff\u28e6\u28f4\u2847\u28ff\u28a8\u28fe\u28ff\u28b9\u28b8";
        CC.nothing_to_see_here[10] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28ff\u280a\u285b\u28bf\u28ff\u28ff\u28ff\u28ff\u287f\u28eb\u28b1\u28ba\u2847\u284f\u28ff\u28ff\u28f8\u287c";
        CC.nothing_to_see_here[11] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u287f\u2804\u28ff\u28f7\u28fe\u284d\u28ed\u28f6\u28ff\u28ff\u284c\u28fc\u28f9\u28b1\u2839\u28ff\u28c7\u28e7";
        CC.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28fc\u2801\u28e4\u28ed\u28ed\u284c\u2881\u28fc\u28ff\u28ff\u28ff\u28b9\u2847\u28ed\u28e4\u28f6\u28e4\u285d\u287c";
        CC.nothing_to_see_here[13] = "\u2804\u28c0\u2824\u2840\u2804\u2804\u2804\u2804\u2804\u284f\u28c8\u287b\u287f\u2803\u2880\u28fe\u28ff\u28ff\u28ff\u287f\u287c\u2801\u28ff\u28ff\u28ff\u287f\u28b7\u28b8";
        CC.nothing_to_see_here[14] = "\u28b0\u28f7\u2867\u2862\u2804\u2804\u2804\u2804\u2820\u28a0\u285b\u283f\u2804\u2820\u282c\u283f\u28ff\u282d\u282d\u28b1\u28c7\u28c0\u28ed\u2845\u2836\u28fe\u28f7\u28f6";
        CC.nothing_to_see_here[15] = "\u2808\u28bf\u28ff\u28e7\u2804\u2804\u2804\u2804\u2880\u285b\u283f\u2804\u2804\u2804\u2804\u28a0\u2803\u2804\u2804\u285c\u2804\u2804\u28e4\u2880\u28f6\u28ee\u284d\u28f4";
        CC.nothing_to_see_here[16] = "\u2804\u2808\u28ff\u28ff\u2840\u2804\u2804\u2804\u28a9\u28dd\u2803\u2804\u2804\u2880\u2844\u284e\u2804\u2804\u2804\u2807\u2804\u2804\u2805\u28f4\u28f6\u28f6\u2804\u28f6";
        int n = 0x3F6E3C94 ^ (0x30D7E4F ^ Integer.parseInt("179639416"));
        CC.lggbkkvkyp = uwepdjczpltgmux();
        CC.EkojHsbPYV = (0x481A4C72 ^ new Random(-6127889578651578219L).nextInt());
        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -1229802215) {
            n ^= 0x264C2670;
            INSTANCE = new CC();
            if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -2066512232) {
                hexPattern = Pattern.compile(kpabwivgnf(twlmilxifonaxms(), 0x6D8FA80 ^ n));
                return;
            }
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1229802215 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x391940D ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1307290984 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x59AC8FAF ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -2066512232 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x13E37F9 ^ n)) {}
        throw new RuntimeException();
    }
    
    public static String kpabwivgnf(final byte[] bytes, final int i) {
        final byte[] bytes2 = Integer.toString(i).getBytes();
        for (int j = 0; j < bytes.length; ++j) {
            final int n = j;
            bytes[n] ^= bytes2[j % bytes2.length];
            final int n2 = j;
            bytes[n2] ^= CC.lggbkkvkyp[j % CC.lggbkkvkyp.length];
        }
        return new String(bytes, StandardCharsets.UTF_16);
    }
    
    private static byte[] uwepdjczpltgmux() {
        return new byte[] { 12, 46, 43, 32, 90, 29, 48, 10, 9, 85, 127, 121, 106, 24, 11, 104, 35, 49, 73, 44, 46, 90, 67, 56, 20, 60, 91, 92, 10, 50, 46, 99, 27, 68, 94, 48, 24, 113, 87, 123, 52, 54, 105, 20, 86, 57, 122, 27, 33, 14, 114, 37, 36, 27, 47, 39, 14, 82, 118, 39, 59, 73, 13, 81, 53, 45, 34, 35, 80, 16, 2, 39, 97, 107, 9, 50, 65, 41, 62, 66 };
    }
    
    private static byte[] twlmilxifonaxms() {
        return new byte[] { -63, -26, 24, 50, 111, 7, 5, 98, 48, 39, 72, 103, 94, 107, 50, 60, 16, 37, 122, 125, 29, 94, 118, 44, 33, 54, 98, 50, 61, 122, 26, 96, 34, 12 };
    }
    
    private static byte[] yugstlglspilspm() {
        return new byte[] { -53, -32, 19, 102, 106, 64, 5, 67, 48, 24 };
    }
    
    private static byte[] adurboiiygzqtbv() {
        return new byte[] { -58, -32, 19, 54 };
    }
    
    private static byte[] zxsbwtfvskykjdv() {
        return new byte[0];
    }
    
    private static byte[] tcbvvinczzwsbgs() {
        return new byte[] { -61, -28, 24, 101, 107, 75, 7, 104, 59, 17, 78, 62, 89, 64, 58, 63, 20, 103, 123, 52, 31, 65, 112, 39, 37, 43, 108, 68 };
    }
    
    private static byte[] eslvoicthjigled() {
        return new byte[] { -61, -31, 30, 102, 109, 93, 1, 82, 61, 3, 78, 58, 95, 70, 60, 59, 18, 124, 125, 113, 31, 43, 118, 102, 35, 122, 106, 0, 62, 120, 31, 61, 46, 23, 105, 118, 41, 45, 99, 0, 5, 105, 92, 74, 97, 100, 75, 80, 21, 117, 67, 122, 17, 77, 24, 112, 63, 24, 66, 55, 10, 87, 56, 77, 2, 49, 19, 51 };
    }
    
    private static byte[] sawqgloeugtdfef() {
        return new byte[] { -64, -31, 28, 96 };
    }
    
    private static byte[] dgsqxablmtmwngc() {
        return new byte[] { -64, -31, 28, 59 };
    }
    
    private static int jovunlqhyttuctam(final int n, final int n2) {
        return n2 ^ n;
    }
}
