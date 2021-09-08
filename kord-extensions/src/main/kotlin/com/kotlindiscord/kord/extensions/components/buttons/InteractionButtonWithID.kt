package com.kotlindiscord.kord.extensions.components.buttons

import com.kotlindiscord.kord.extensions.components.ComponentWithID
import com.kotlindiscord.kord.extensions.components.types.HasPartialEmoji
import dev.kord.common.entity.DiscordPartialEmoji

/** Abstract class representing a button component with an ID, but without a click action. **/
public abstract class InteractionButtonWithID : ComponentWithID(), HasPartialEmoji {
    /** Button label, for display on Discord. **/
    public var label: String? = null
    public override var partialEmoji: DiscordPartialEmoji? = null

    override fun validate() {
        super.validate()

        if (label == null && partialEmoji == null) {
            error("Buttons must have either a label or emoji.")
        }
    }
}