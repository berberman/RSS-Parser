package com.prof18.rssparser.model

data class RssEnclosure(
    val url: String?,
    val length: String?,
    val type: String?,
) {
    internal data class Builder(
        private var url: String? = null,
        private var length: String? = null,
        private var type: String? = null,
    ) {
        fun url(url: String?) = apply { this.url = url }
        fun length(length: String?) = apply { this.length = length }
        fun type(type: String?) = apply { this.type = type }

        fun build() =
            RssEnclosure(
                url = this.url,
                length = this.length,
                type = this.type
            )
    }
}