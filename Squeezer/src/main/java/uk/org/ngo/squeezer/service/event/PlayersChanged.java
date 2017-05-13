/*
 * Copyright (c) 2014 Google Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.org.ngo.squeezer.service.event;

import com.google.auto.value.AutoValue;

import java.util.Map;

import uk.org.ngo.squeezer.model.Player;

/**
 * Event sent when the list of players connected to the server has changed.
 */
@AutoValue
public abstract class PlayersChanged {
    /** The players connected to the Squeezeserver. May be empty. */
    public abstract Map<String, Player> players();

    public static PlayersChanged create(Map<String, Player> players) {
        return new AutoValue_PlayersChanged(players);
    }
}
