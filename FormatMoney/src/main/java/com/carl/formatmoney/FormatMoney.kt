package com.carl.formatmoney

import java.math.BigDecimal
import java.text.DecimalFormat

open class FormatMoney {

    companion object{
        const val Decimal8 = "##.########"
        const val Percentile8 = "#,###.########"
        const val Percentile2 = "#,###.##"
        const val Percentile = "#,###"
        const val Normal = "###"
    }

    /**
     * 格式化 帶入浮動參數
     * **/
    fun format(double: Double,value: String) :String{
        val df = DecimalFormat(value)
        return df.format(double)
    }

    fun format(string: String,value: String) :String{
        val df = DecimalFormat(value)
        return df.format(string.toDouble())
    }

    /**
     * 標準化小數點第八位
     * **/
    fun fiat(double: Double) :String{
        val df = DecimalFormat("#,###.########")
        return df.format(double)
    }

    fun fiat(string: String) :String{
        val df = DecimalFormat("#,###.########")
        return df.format(string.toDouble())
    }

    /**
     * 標準化小數點第二位
     * **/
    fun amount(double: Double):String{
        val df = DecimalFormat("#,###.##")
        return df.format(double)
    }

    fun amount(string: String):String{
        val df = DecimalFormat("#,###.##")
        return df.format(string.toDouble())
    }

    /**
     * 小數點第八位
     * **/
    fun change(double: Double) :String{
        val df = DecimalFormat("##.########")
        return df.format(double)
    }

    fun change(string: String) :String{
        val df = DecimalFormat("##.########")
        return df.format(string.toDouble())
    }

    /**
     * 顯示單位 億 萬
     * **/
    fun formatBigNum(num: String?): String {
        try {
            if (num == null) {
                return "-"
            }
            var sb = StringBuffer()
            var b1 = BigDecimal("10000")
            var b2 = BigDecimal("100000000")
            var b3 = BigDecimal(num)
            var formatNum: String = ""
            var unit: String = ""
            if (b3.compareTo(b1) == -1) {
                sb.append(b3.toString());
            } else if ((b3.compareTo(b1) == 0 && b3.compareTo(b1) == 1) || b3.compareTo(b2) == -1) {
                formatNum = b3.divide(b1).toString();
                unit = "萬";
            } else if (b3.compareTo(b2) == 0 || b3.compareTo(b2) == 1) {
                formatNum = b3.divide(b2).toString();
                unit = "億";
            }
            if ("" != formatNum) {
                var i = formatNum.indexOf(".");
                if (i == -1) {
                    sb.append(formatNum).append(unit);
                } else {
                    i += 1
                    var v = formatNum.substring(i, i + 1);
                    if (v != "0") {
                        sb.append(formatNum.substring(0, i + 1)).append(unit);
                    } else {
                        sb.append(formatNum.substring(0, i - 1)).append(unit);
                    }
                }
            }
            if (sb.isEmpty()) return ""
            return sb.toString();

        } catch (e: Exception) {
            return "-"
        }
        return "-"
    }
}