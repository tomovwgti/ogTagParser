package com.anandwana001.ogtagparser

/**
 * Created by akshaynandwana on
 * 26, January, 2019
 **/

/**
 * An helper class to get the parse data
 */
interface LinkViewCallback {

    // before parsing gets done, this method gets called
    fun onBeforeLoading()

    // after parsing gets complete, LinkSourceContent is passed with all the parsed data
    fun onAfterLoading(linkSourceContent: LinkSourceContent)
}
