/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PersonMatch
 */
class PersonMatchJsonUnmarshaller implements Unmarshaller<PersonMatch, JsonUnmarshallerContext> {

    public PersonMatch unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PersonMatch personMatch = new PersonMatch();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Timestamp")) {
                personMatch.setTimestamp(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Person")) {
                personMatch.setPerson(PersonDetailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FaceMatches")) {
                personMatch.setFaceMatches(new ListUnmarshaller<FaceMatch>(
                        FaceMatchJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return personMatch;
    }

    private static PersonMatchJsonUnmarshaller instance;

    public static PersonMatchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PersonMatchJsonUnmarshaller();
        return instance;
    }
}
