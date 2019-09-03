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

package co.anitrend.data.model.core.studio

import co.anitrend.data.model.core.media.connection.MediaConnection
import co.anitrend.domain.entities.response.studio.IStudio

/** [Studio](https://anilist.github.io/ApiV2-GraphQL-Docs/studio.doc.html)
 * Animation or production company
 *
 * @param favourites The amount of user's who have favourite the studio
 */
data class Studio(
    val media: MediaConnection?,
    override val favourites: Int?,
    override val id: Long,
    override val isAnimationStudio: Boolean,
    override val isFavourite: Boolean,
    override val name: String,
    override val siteUrl: String?
) : IStudio