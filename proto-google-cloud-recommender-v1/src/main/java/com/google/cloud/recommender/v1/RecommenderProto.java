/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1/recommender_service.proto

package com.google.cloud.recommender.v1;

public final class RecommenderProto {
  private RecommenderProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_ListInsightsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ListInsightsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_ListInsightsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ListInsightsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_GetInsightRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_GetInsightRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_GetRecommendationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_GetRecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/recommender/v1/recommende"
          + "r_service.proto\022\033google.cloud.recommende"
          + "r.v1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + ")google/cloud/recommender/v1/insight.pro"
          + "to\0320google/cloud/recommender/v1/recommen"
          + "dation.proto\"\233\001\n\023ListInsightsRequest\022>\n\006"
          + "parent\030\001 \001(\tB.\340A\002\372A(\n&recommender.google"
          + "apis.com/InsightType\022\026\n\tpage_size\030\002 \001(\005B"
          + "\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030"
          + "\004 \001(\tB\003\340A\001\"g\n\024ListInsightsResponse\0226\n\010in"
          + "sights\030\001 \003(\0132$.google.cloud.recommender."
          + "v1.Insight\022\027\n\017next_page_token\030\002 \001(\t\"M\n\021G"
          + "etInsightRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\""
          + "recommender.googleapis.com/Insight\"\210\002\n\032M"
          + "arkInsightAcceptedRequest\0228\n\004name\030\001 \001(\tB"
          + "*\340A\002\372A$\n\"recommender.googleapis.com/Insi"
          + "ght\022g\n\016state_metadata\030\002 \003(\0132J.google.clo"
          + "ud.recommender.v1.MarkInsightAcceptedReq"
          + "uest.StateMetadataEntryB\003\340A\001\022\021\n\004etag\030\003 \001"
          + "(\tB\003\340A\002\0324\n\022StateMetadataEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\235\001\n\032ListRecommenda"
          + "tionsRequest\022>\n\006parent\030\001 \001(\tB.\340A\002\372A(\n&re"
          + "commender.googleapis.com/Recommender\022\026\n\t"
          + "page_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\t"
          + "B\003\340A\001\022\016\n\006filter\030\005 \001(\t\"|\n\033ListRecommendat"
          + "ionsResponse\022D\n\017recommendations\030\001 \003(\0132+."
          + "google.cloud.recommender.v1.Recommendati"
          + "on\022\027\n\017next_page_token\030\002 \001(\t\"[\n\030GetRecomm"
          + "endationRequest\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)r"
          + "ecommender.googleapis.com/Recommendation"
          + "\"\226\002\n MarkRecommendationClaimedRequest\022?\n"
          + "\004name\030\001 \001(\tB1\340A\002\372A+\n)recommender.googlea"
          + "pis.com/Recommendation\022h\n\016state_metadata"
          + "\030\002 \003(\0132P.google.cloud.recommender.v1.Mar"
          + "kRecommendationClaimedRequest.StateMetad"
          + "ataEntry\022\021\n\004etag\030\003 \001(\tB\003\340A\002\0324\n\022StateMeta"
          + "dataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028"
          + "\001\"\232\002\n\"MarkRecommendationSucceededRequest"
          + "\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)recommender.goog"
          + "leapis.com/Recommendation\022j\n\016state_metad"
          + "ata\030\002 \003(\0132R.google.cloud.recommender.v1."
          + "MarkRecommendationSucceededRequest.State"
          + "MetadataEntry\022\021\n\004etag\030\003 \001(\tB\003\340A\002\0324\n\022Stat"
          + "eMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001\"\224\002\n\037MarkRecommendationFailedReque"
          + "st\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)recommender.go"
          + "ogleapis.com/Recommendation\022g\n\016state_met"
          + "adata\030\002 \003(\0132O.google.cloud.recommender.v"
          + "1.MarkRecommendationFailedRequest.StateM"
          + "etadataEntry\022\021\n\004etag\030\003 \001(\tB\003\340A\002\0324\n\022State"
          + "MetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\0012\371\016\n\013Recommender\022\301\001\n\014ListInsights\0220"
          + ".google.cloud.recommender.v1.ListInsight"
          + "sRequest\0321.google.cloud.recommender.v1.L"
          + "istInsightsResponse\"L\202\323\344\223\002=\022;/v1/{parent"
          + "=projects/*/locations/*/insightTypes/*}/"
          + "insights\332A\006parent\022\256\001\n\nGetInsight\022..googl"
          + "e.cloud.recommender.v1.GetInsightRequest"
          + "\032$.google.cloud.recommender.v1.Insight\"J"
          + "\202\323\344\223\002=\022;/v1/{name=projects/*/locations/*"
          + "/insightTypes/*/insights/*}\332A\004name\022\344\001\n\023M"
          + "arkInsightAccepted\0227.google.cloud.recomm"
          + "ender.v1.MarkInsightAcceptedRequest\032$.go"
          + "ogle.cloud.recommender.v1.Insight\"n\202\323\344\223\002"
          + "M\"H/v1/{name=projects/*/locations/*/insi"
          + "ghtTypes/*/insights/*}:markAccepted:\001*\332A"
          + "\030name,state_metadata,etag\022\355\001\n\023ListRecomm"
          + "endations\0227.google.cloud.recommender.v1."
          + "ListRecommendationsRequest\0328.google.clou"
          + "d.recommender.v1.ListRecommendationsResp"
          + "onse\"c\202\323\344\223\002D\022B/v1/{parent=projects/*/loc"
          + "ations/*/recommenders/*}/recommendations"
          + "\332A\006parent\332A\rparent,filter\022\312\001\n\021GetRecomme"
          + "ndation\0225.google.cloud.recommender.v1.Ge"
          + "tRecommendationRequest\032+.google.cloud.re"
          + "commender.v1.Recommendation\"Q\202\323\344\223\002D\022B/v1"
          + "/{name=projects/*/locations/*/recommende"
          + "rs/*/recommendations/*}\332A\004name\022\375\001\n\031MarkR"
          + "ecommendationClaimed\022=.google.cloud.reco"
          + "mmender.v1.MarkRecommendationClaimedRequ"
          + "est\032+.google.cloud.recommender.v1.Recomm"
          + "endation\"t\202\323\344\223\002S\"N/v1/{name=projects/*/l"
          + "ocations/*/recommenders/*/recommendation"
          + "s/*}:markClaimed:\001*\332A\030name,state_metadat"
          + "a,etag\022\203\002\n\033MarkRecommendationSucceeded\022?"
          + ".google.cloud.recommender.v1.MarkRecomme"
          + "ndationSucceededRequest\032+.google.cloud.r"
          + "ecommender.v1.Recommendation\"v\202\323\344\223\002U\"P/v"
          + "1/{name=projects/*/locations/*/recommend"
          + "ers/*/recommendations/*}:markSucceeded:\001"
          + "*\332A\030name,state_metadata,etag\022\372\001\n\030MarkRec"
          + "ommendationFailed\022<.google.cloud.recomme"
          + "nder.v1.MarkRecommendationFailedRequest\032"
          + "+.google.cloud.recommender.v1.Recommenda"
          + "tion\"s\202\323\344\223\002R\"M/v1/{name=projects/*/locat"
          + "ions/*/recommenders/*/recommendations/*}"
          + ":markFailed:\001*\332A\030name,state_metadata,eta"
          + "g\032N\312A\032recommender.googleapis.com\322A.https"
          + "://www.googleapis.com/auth/cloud-platfor"
          + "mB\242\001\n\037com.google.cloud.recommender.v1B\020R"
          + "ecommenderProtoP\001ZFgoogle.golang.org/gen"
          + "proto/googleapis/cloud/recommender/v1;re"
          + "commender\242\002\004CREC\252\002\033Google.Cloud.Recommen"
          + "der.V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.recommender.v1.InsightProto.getDescriptor(),
              com.google.cloud.recommender.v1.RecommendationOuterClass.getDescriptor(),
            });
    internal_static_google_cloud_recommender_v1_ListInsightsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommender_v1_ListInsightsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_ListInsightsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_recommender_v1_ListInsightsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommender_v1_ListInsightsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_ListInsightsResponse_descriptor,
            new java.lang.String[] {
              "Insights", "NextPageToken",
            });
    internal_static_google_cloud_recommender_v1_GetInsightRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommender_v1_GetInsightRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_GetInsightRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_descriptor,
            new java.lang.String[] {
              "Name", "StateMetadata", "Etag",
            });
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_descriptor =
        internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_descriptor,
            new java.lang.String[] {
              "Recommendations", "NextPageToken",
            });
    internal_static_google_cloud_recommender_v1_GetRecommendationRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recommender_v1_GetRecommendationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_GetRecommendationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor,
            new java.lang.String[] {
              "Name", "StateMetadata", "Etag",
            });
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_descriptor =
        internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_descriptor,
            new java.lang.String[] {
              "Name", "StateMetadata", "Etag",
            });
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_descriptor =
        internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_descriptor,
            new java.lang.String[] {
              "Name", "StateMetadata", "Etag",
            });
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_descriptor =
        internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.recommender.v1.InsightProto.getDescriptor();
    com.google.cloud.recommender.v1.RecommendationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
