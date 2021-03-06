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

package co.anitrend.data.model.response.core.user.statistics

import co.anitrend.data.model.response.core.studio.Studio
import co.anitrend.data.model.response.core.user.statistics.contract.IUserStatistic

/** [UserStudioStatistic](https://anilist.github.io/ApiV2-GraphQL-Docs/userstudiostatistic.doc.html)
 *
 * @param studio studio
 */
data class UserStudioStatistic(
    val studio: Studio?,
    override val chaptersRead: Int,
    override val count: Int,
    override val meanScore: Float,
    override val mediaIds: List<Int>,
    override val minutesWatched: Int
) : IUserStatistic
