/*
 * Copyright (c) 2013 Mozilla Foundation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
 * DEALINGS IN THE SOFTWARE.
 */

/*
 * THIS IS A GENERATED FILE. PLEASE DO NOT EDIT.
 * Instead, please regenerate using generate-encoding-data.py
 */

package nu.validator.datatype.data;

import java.util.Arrays;

public class CharsetData {

    private static final String[] LABELS = {
        "866",
        "ansi_x3.4-1968",
        "arabic",
        "ascii",
        "asmo-708",
        "big5",
        "big5-hkscs",
        "chinese",
        "cn-big5",
        "cp1250",
        "cp1251",
        "cp1252",
        "cp1253",
        "cp1254",
        "cp1255",
        "cp1256",
        "cp1257",
        "cp1258",
        "cp819",
        "cp866",
        "csbig5",
        "cseuckr",
        "cseucpkdfmtjapanese",
        "csgb2312",
        "csibm866",
        "csiso2022jp",
        "csiso2022kr",
        "csiso58gb231280",
        "csiso88596e",
        "csiso88596i",
        "csiso88598e",
        "csiso88598i",
        "csisolatin1",
        "csisolatin2",
        "csisolatin3",
        "csisolatin4",
        "csisolatin5",
        "csisolatin6",
        "csisolatin9",
        "csisolatinarabic",
        "csisolatincyrillic",
        "csisolatingreek",
        "csisolatinhebrew",
        "cskoi8r",
        "csksc56011987",
        "csmacintosh",
        "csshiftjis",
        "cyrillic",
        "dos-874",
        "ecma-114",
        "ecma-118",
        "elot_928",
        "euc-jp",
        "euc-kr",
        "gb18030",
        "gb2312",
        "gb_2312",
        "gb_2312-80",
        "gbk",
        "greek",
        "greek8",
        "hebrew",
        "hz-gb-2312",
        "ibm819",
        "ibm866",
        "iso-2022-cn",
        "iso-2022-cn-ext",
        "iso-2022-jp",
        "iso-2022-kr",
        "iso-8859-1",
        "iso-8859-10",
        "iso-8859-11",
        "iso-8859-13",
        "iso-8859-14",
        "iso-8859-15",
        "iso-8859-16",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "iso-8859-5",
        "iso-8859-6",
        "iso-8859-6-e",
        "iso-8859-6-i",
        "iso-8859-7",
        "iso-8859-8",
        "iso-8859-8-e",
        "iso-8859-8-i",
        "iso-8859-9",
        "iso-ir-100",
        "iso-ir-101",
        "iso-ir-109",
        "iso-ir-110",
        "iso-ir-126",
        "iso-ir-127",
        "iso-ir-138",
        "iso-ir-144",
        "iso-ir-148",
        "iso-ir-149",
        "iso-ir-157",
        "iso-ir-58",
        "iso8859-1",
        "iso8859-10",
        "iso8859-11",
        "iso8859-13",
        "iso8859-14",
        "iso8859-15",
        "iso8859-2",
        "iso8859-3",
        "iso8859-4",
        "iso8859-5",
        "iso8859-6",
        "iso8859-7",
        "iso8859-8",
        "iso8859-9",
        "iso88591",
        "iso885910",
        "iso885911",
        "iso885913",
        "iso885914",
        "iso885915",
        "iso88592",
        "iso88593",
        "iso88594",
        "iso88595",
        "iso88596",
        "iso88597",
        "iso88598",
        "iso88599",
        "iso_8859-1",
        "iso_8859-15",
        "iso_8859-1:1987",
        "iso_8859-2",
        "iso_8859-2:1987",
        "iso_8859-3",
        "iso_8859-3:1988",
        "iso_8859-4",
        "iso_8859-4:1988",
        "iso_8859-5",
        "iso_8859-5:1988",
        "iso_8859-6",
        "iso_8859-6:1987",
        "iso_8859-7",
        "iso_8859-7:1987",
        "iso_8859-8",
        "iso_8859-8:1988",
        "iso_8859-9",
        "iso_8859-9:1989",
        "koi",
        "koi8",
        "koi8-r",
        "koi8-u",
        "koi8_r",
        "korean",
        "ks_c_5601-1987",
        "ks_c_5601-1989",
        "ksc5601",
        "ksc_5601",
        "l1",
        "l2",
        "l3",
        "l4",
        "l5",
        "l6",
        "l9",
        "latin1",
        "latin2",
        "latin3",
        "latin4",
        "latin5",
        "latin6",
        "logical",
        "mac",
        "macintosh",
        "ms_kanji",
        "shift-jis",
        "shift_jis",
        "sjis",
        "sun_eu_greek",
        "tis-620",
        "unicode-1-1-utf-8",
        "us-ascii",
        "utf-16",
        "utf-16be",
        "utf-16le",
        "utf-8",
        "utf8",
        "visual",
        "windows-1250",
        "windows-1251",
        "windows-1252",
        "windows-1253",
        "windows-1254",
        "windows-1255",
        "windows-1256",
        "windows-1257",
        "windows-1258",
        "windows-31j",
        "windows-874",
        "windows-949",
        "x-cp1250",
        "x-cp1251",
        "x-cp1252",
        "x-cp1253",
        "x-cp1254",
        "x-cp1255",
        "x-cp1256",
        "x-cp1257",
        "x-cp1258",
        "x-euc-jp",
        "x-gbk",
        "x-mac-cyrillic",
        "x-mac-roman",
        "x-mac-ukrainian",
        "x-sjis",
        "x-user-defined",
        "x-x-big5",
    };
    
    private static final String[] PREFERRED_FOR_LABELS = {
        "ibm866",
        "windows-1252",
        "iso-8859-6",
        "windows-1252",
        "iso-8859-6",
        "big5",
        "big5",
        "gbk",
        "big5",
        "windows-1250",
        "windows-1251",
        "windows-1252",
        "windows-1253",
        "windows-1254",
        "windows-1255",
        "windows-1256",
        "windows-1257",
        "windows-1258",
        "windows-1252",
        "ibm866",
        "big5",
        "euc-kr",
        "euc-jp",
        "gbk",
        "ibm866",
        "iso-2022-jp",
        "iso-2022-kr",
        "gbk",
        "iso-8859-6",
        "iso-8859-6",
        "iso-8859-8",
        "iso-8859-8-i",
        "windows-1252",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "windows-1254",
        "iso-8859-10",
        "iso-8859-15",
        "iso-8859-6",
        "iso-8859-5",
        "iso-8859-7",
        "iso-8859-8",
        "koi8-r",
        "euc-kr",
        "macintosh",
        "shift_jis",
        "iso-8859-5",
        "windows-874",
        "iso-8859-6",
        "iso-8859-7",
        "iso-8859-7",
        "euc-jp",
        "euc-kr",
        "gb18030",
        "gbk",
        "gbk",
        "gbk",
        "gbk",
        "iso-8859-7",
        "iso-8859-7",
        "iso-8859-8",
        "hz-gb-2312",
        "windows-1252",
        "ibm866",
        "replacement",
        "replacement",
        "iso-2022-jp",
        "iso-2022-kr",
        "windows-1252",
        "iso-8859-10",
        "windows-874",
        "iso-8859-13",
        "iso-8859-14",
        "iso-8859-15",
        "iso-8859-16",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "iso-8859-5",
        "iso-8859-6",
        "iso-8859-6",
        "iso-8859-6",
        "iso-8859-7",
        "iso-8859-8",
        "iso-8859-8",
        "iso-8859-8-i",
        "windows-1254",
        "windows-1252",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "iso-8859-7",
        "iso-8859-6",
        "iso-8859-8",
        "iso-8859-5",
        "windows-1254",
        "euc-kr",
        "iso-8859-10",
        "gbk",
        "windows-1252",
        "iso-8859-10",
        "windows-874",
        "iso-8859-13",
        "iso-8859-14",
        "iso-8859-15",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "iso-8859-5",
        "iso-8859-6",
        "iso-8859-7",
        "iso-8859-8",
        "windows-1254",
        "windows-1252",
        "iso-8859-10",
        "windows-874",
        "iso-8859-13",
        "iso-8859-14",
        "iso-8859-15",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "iso-8859-5",
        "iso-8859-6",
        "iso-8859-7",
        "iso-8859-8",
        "windows-1254",
        "windows-1252",
        "iso-8859-15",
        "windows-1252",
        "iso-8859-2",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-3",
        "iso-8859-4",
        "iso-8859-4",
        "iso-8859-5",
        "iso-8859-5",
        "iso-8859-6",
        "iso-8859-6",
        "iso-8859-7",
        "iso-8859-7",
        "iso-8859-8",
        "iso-8859-8",
        "windows-1254",
        "windows-1254",
        "koi8-r",
        "koi8-r",
        "koi8-r",
        "koi8-u",
        "koi8-r",
        "euc-kr",
        "euc-kr",
        "euc-kr",
        "euc-kr",
        "euc-kr",
        "windows-1252",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "windows-1254",
        "iso-8859-10",
        "iso-8859-15",
        "windows-1252",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "windows-1254",
        "iso-8859-10",
        "iso-8859-8-i",
        "macintosh",
        "macintosh",
        "shift_jis",
        "shift_jis",
        "shift_jis",
        "shift_jis",
        "iso-8859-7",
        "windows-874",
        "utf-8",
        "windows-1252",
        "utf-16le",
        "utf-16be",
        "utf-16le",
        "utf-8",
        "utf-8",
        "iso-8859-8",
        "windows-1250",
        "windows-1251",
        "windows-1252",
        "windows-1253",
        "windows-1254",
        "windows-1255",
        "windows-1256",
        "windows-1257",
        "windows-1258",
        "shift_jis",
        "windows-874",
        "euc-kr",
        "windows-1250",
        "windows-1251",
        "windows-1252",
        "windows-1253",
        "windows-1254",
        "windows-1255",
        "windows-1256",
        "windows-1257",
        "windows-1258",
        "euc-jp",
        "gbk",
        "x-mac-cyrillic",
        "macintosh",
        "x-mac-cyrillic",
        "shift_jis",
        "x-user-defined",
        "big5",
    };

    private static final String[] PREFERRED = {
        "big5",
        "euc-jp",
        "euc-kr",
        "gb18030",
        "gbk",
        "hz-gb-2312",
        "ibm866",
        "iso-2022-jp",
        "iso-2022-kr",
        "iso-8859-10",
        "iso-8859-13",
        "iso-8859-14",
        "iso-8859-15",
        "iso-8859-16",
        "iso-8859-2",
        "iso-8859-3",
        "iso-8859-4",
        "iso-8859-5",
        "iso-8859-6",
        "iso-8859-7",
        "iso-8859-8",
        "iso-8859-8-i",
        "koi8-r",
        "koi8-u",
        "macintosh",
        "replacement",
        "shift_jis",
        "utf-16be",
        "utf-16le",
        "utf-8",
        "windows-1250",
        "windows-1251",
        "windows-1252",
        "windows-1253",
        "windows-1254",
        "windows-1255",
        "windows-1256",
        "windows-1257",
        "windows-1258",
        "windows-874",
        "x-mac-cyrillic",
        "x-user-defined",
    };

    public static boolean isPreferred(String label) {
        return Arrays.binarySearch(PREFERRED, label) > -1;
    }
    
    public static String preferredForLabel(String label) {
        int index = Arrays.binarySearch(LABELS, label);
        if (index < 0) {
            return null;
        }
        return PREFERRED_FOR_LABELS[index];
    }
}
