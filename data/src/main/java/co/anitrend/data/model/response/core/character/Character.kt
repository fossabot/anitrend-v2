/*
 * Copyright (C) 2019  AniTrend
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package co.anitrend.data.model.response.core.character

import co.anitrend.data.model.response.core.character.contract.ICharacter
import co.anitrend.data.model.response.core.media.connection.MediaConnection
import co.anitrend.data.model.response.meta.CoverImage
import co.anitrend.data.model.response.meta.CoverName

/** [Character](https://anilist.github.io/ApiV2-GraphQL-Docs/character.doc.html)
 * A character that features in an anime or manga
 *
 * @param description A general description of the character
 */
class Character(
    val media: MediaConnection?,
    override val description: String?,
    override val favourites: Int?,
    override val id: Long,
    override val image: CoverImage?,
    override val isFavourite: Boolean,
    override val name: CoverName?,
    override val siteUrl: String?,
    override val updatedAt: Long?
) : ICharacter