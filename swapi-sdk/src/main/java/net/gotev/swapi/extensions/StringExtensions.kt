package net.gotev.swapi.extensions

import net.gotev.swapi.models.Manufacturer
import java.util.Locale

fun String.asCSVList() = split(",").map { it.trim() }
fun String.asLintedLowercaseCSVList() = asCSVList()
    .map { it.toLowerCase(Locale.getDefault()) }
    .map { it.split("/") }
    .flatten() // theed palace space vessel engineering corps/nubia star drives

fun String.pageNumber() = split("=").getOrNull(1)?.toInt()

internal fun String.lintManufacturer() = when (val linted = replace(".", "")) {
    "incom" -> Manufacturer.IncomCorporation.rawValue

    "inc" -> Manufacturer.Incorporated.rawValue

    "cyngus spaceworks" -> Manufacturer.CygnusSpaceworks.rawValue

    else -> linted
}
