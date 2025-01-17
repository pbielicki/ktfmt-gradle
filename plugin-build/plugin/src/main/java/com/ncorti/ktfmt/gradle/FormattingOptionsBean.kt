package com.ncorti.ktfmt.gradle

import java.io.Serializable

internal data class FormattingOptionsBean(

    /** The style used by ktfmt */
    val style: Style = Style.FACEBOOK,

    /** ktfmt breaks lines longer than maxWidth. */
    val maxWidth: Int = defaultMaxWidth,

    /**
     * blockIndent is the size of the indent used when a new block is opened, in spaces.
     *
     * For example,
     * ```
     * fun f() {
     *   //
     * }
     * ```
     */
    val blockIndent: Int = 2,

    /**
     * continuationIndent is the size of the indent used when a line is broken because it's too
     * long, in spaces.
     *
     * For example,
     * ```
     * val foo = bar(
     *     1)
     * ```
     */
    val continuationIndent: Int = 4,

    /** Whether ktfmt should remove imports that are not used. */
    val removeUnusedImports: Boolean = true,

    /**
     * Print the Ops generated by KotlinInputAstVisitor to help reason about formatting (i.e.,
     * newline) decisions
     */
    val debuggingPrintOpsAfterFormatting: Boolean = false
) : Serializable {
    enum class Style {
        FACEBOOK,
        DROPBOX,
        GOOGLE
    }

    companion object {
        private const val serialVersionUID: Long = 1L
        private const val defaultMaxWidth = 100
    }
}
