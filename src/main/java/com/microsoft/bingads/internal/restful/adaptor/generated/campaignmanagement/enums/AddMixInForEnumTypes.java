package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForEnumTypes {
	public static void AddMixInForEnumTypes() {
		AdaptorUtil.mapper
				.addMixIn(AdEditorialStatus.class, AdEditorialStatusMixIn.class)
				.addMixIn(AdStatus.class, AdStatusMixIn.class)
				.addMixIn(AdType.class, AdTypeMixIn.class)
				.addMixIn(AdSubType.class, AdSubTypeMixIn.class)
				.addMixIn(CallToAction.class, CallToActionMixIn.class)
				.addMixIn(LanguageName.class, LanguageNameMixIn.class)
				.addMixIn(AssetLinkEditorialStatus.class, AssetLinkEditorialStatusMixIn.class)
				.addMixIn(DynamicSearchAdsSource.class, DynamicSearchAdsSourceMixIn.class)
				.addMixIn(CriterionTypeGroup.class, CriterionTypeGroupMixIn.class)
				.addMixIn(BidOption.class, BidOptionMixIn.class)
				.addMixIn(HotelAdGroupType.class, HotelAdGroupTypeMixIn.class)
				.addMixIn(VanityPharmaDisplayUrlMode.class, VanityPharmaDisplayUrlModeMixIn.class)
				.addMixIn(VanityPharmaWebsiteDescription.class, VanityPharmaWebsiteDescriptionMixIn.class)
				.addMixIn(AppStore.class, AppStoreMixIn.class)
				.addMixIn(BudgetLimitType.class, BudgetLimitTypeMixIn.class)
				.addMixIn(CampaignStatus.class, CampaignStatusMixIn.class)
				.addMixIn(CampaignType.class, CampaignTypeMixIn.class)
				.addMixIn(CampaignAdditionalField.class, CampaignAdditionalFieldMixIn.class)
				.addMixIn(AdRotationType.class, AdRotationTypeMixIn.class)
				.addMixIn(FrequencyCapTimeGranularity.class, FrequencyCapTimeGranularityMixIn.class)
				.addMixIn(Network.class, NetworkMixIn.class)
				.addMixIn(AdGroupPrivacyStatus.class, AdGroupPrivacyStatusMixIn.class)
				.addMixIn(AdGroupStatus.class, AdGroupStatusMixIn.class)
				.addMixIn(AdGroupAdditionalField.class, AdGroupAdditionalFieldMixIn.class)
				.addMixIn(CompressionType.class, CompressionTypeMixIn.class)
				.addMixIn(AdAdditionalField.class, AdAdditionalFieldMixIn.class)
				.addMixIn(KeywordEditorialStatus.class, KeywordEditorialStatusMixIn.class)
				.addMixIn(MatchType.class, MatchTypeMixIn.class)
				.addMixIn(KeywordStatus.class, KeywordStatusMixIn.class)
				.addMixIn(EntityType.class, EntityTypeMixIn.class)
				.addMixIn(AppealStatus.class, AppealStatusMixIn.class)
				.addMixIn(MigrationStatus.class, MigrationStatusMixIn.class)
				.addMixIn(AccountPropertyName.class, AccountPropertyNameMixIn.class)
				.addMixIn(Day.class, DayMixIn.class)
				.addMixIn(Minute.class, MinuteMixIn.class)
				.addMixIn(AdExtensionStatus.class, AdExtensionStatusMixIn.class)
				.addMixIn(BusinessGeoCodeStatus.class, BusinessGeoCodeStatusMixIn.class)
				.addMixIn(ActionAdExtensionActionType.class, ActionAdExtensionActionTypeMixIn.class)
				.addMixIn(PriceExtensionType.class, PriceExtensionTypeMixIn.class)
				.addMixIn(PriceQualifier.class, PriceQualifierMixIn.class)
				.addMixIn(PriceUnit.class, PriceUnitMixIn.class)
				.addMixIn(PromotionDiscountModifier.class, PromotionDiscountModifierMixIn.class)
				.addMixIn(PromotionOccasion.class, PromotionOccasionMixIn.class)
				.addMixIn(AdExtensionHeaderType.class, AdExtensionHeaderTypeMixIn.class)
				.addMixIn(AdExtensionsTypeFilter.class, AdExtensionsTypeFilterMixIn.class)
				.addMixIn(AdExtensionAdditionalField.class, AdExtensionAdditionalFieldMixIn.class)
				.addMixIn(AssociationType.class, AssociationTypeMixIn.class)
				.addMixIn(AdExtensionEditorialStatus.class, AdExtensionEditorialStatusMixIn.class)
				.addMixIn(MediaEnabledEntityFilter.class, MediaEnabledEntityFilterMixIn.class)
				.addMixIn(MediaAdditionalField.class, MediaAdditionalFieldMixIn.class)
				.addMixIn(AdGroupCriterionType.class, AdGroupCriterionTypeMixIn.class)
				.addMixIn(CriterionAdditionalField.class, CriterionAdditionalFieldMixIn.class)
				.addMixIn(ProductPartitionType.class, ProductPartitionTypeMixIn.class)
				.addMixIn(HotelListingType.class, HotelListingTypeMixIn.class)
				.addMixIn(HotelDateSelectionType.class, HotelDateSelectionTypeMixIn.class)
				.addMixIn(WebpageConditionOperand.class, WebpageConditionOperandMixIn.class)
				.addMixIn(WebpageConditionOperator.class, WebpageConditionOperatorMixIn.class)
				.addMixIn(AgeRange.class, AgeRangeMixIn.class)
				.addMixIn(GenderType.class, GenderTypeMixIn.class)
				.addMixIn(DistanceUnit.class, DistanceUnitMixIn.class)
				.addMixIn(IntentOption.class, IntentOptionMixIn.class)
				.addMixIn(AudienceType.class, AudienceTypeMixIn.class)
				.addMixIn(ProfileType.class, ProfileTypeMixIn.class)
				.addMixIn(AdGroupCriterionStatus.class, AdGroupCriterionStatusMixIn.class)
				.addMixIn(AdGroupCriterionEditorialStatus.class, AdGroupCriterionEditorialStatusMixIn.class)
				.addMixIn(ItemAction.class, ItemActionMixIn.class)
				.addMixIn(AssetGroupListingType.class, AssetGroupListingTypeMixIn.class)
				.addMixIn(BMCStoreAdditionalField.class, BMCStoreAdditionalFieldMixIn.class)
				.addMixIn(BMCStoreSubType.class, BMCStoreSubTypeMixIn.class)
				.addMixIn(EntityScope.class, EntityScopeMixIn.class)
				.addMixIn(CampaignCriterionStatus.class, CampaignCriterionStatusMixIn.class)
				.addMixIn(CampaignCriterionType.class, CampaignCriterionTypeMixIn.class)
				.addMixIn(AudienceGroupDimensionType.class, AudienceGroupDimensionTypeMixIn.class)
				.addMixIn(AudienceGroupAdditionalField.class, AudienceGroupAdditionalFieldMixIn.class)
				.addMixIn(AssetGroupEditorialStatus.class, AssetGroupEditorialStatusMixIn.class)
				.addMixIn(AssetGroupStatus.class, AssetGroupStatusMixIn.class)
				.addMixIn(AssetGroupAdditionalField.class, AssetGroupAdditionalFieldMixIn.class)
				.addMixIn(NormalForm.class, NormalFormMixIn.class)
				.addMixIn(StringOperator.class, StringOperatorMixIn.class)
				.addMixIn(NumberOperator.class, NumberOperatorMixIn.class)
				.addMixIn(ProductAudienceType.class, ProductAudienceTypeMixIn.class)
				.addMixIn(LogicalOperator.class, LogicalOperatorMixIn.class)
				.addMixIn(ImpressionBasedEntityType.class, ImpressionBasedEntityTypeMixIn.class)
				.addMixIn(AudienceAdditionalField.class, AudienceAdditionalFieldMixIn.class)
				.addMixIn(CustomerListActionType.class, CustomerListActionTypeMixIn.class)
				.addMixIn(CustomerListItemSubType.class, CustomerListItemSubTypeMixIn.class)
				.addMixIn(UetTagTrackingStatus.class, UetTagTrackingStatusMixIn.class)
				.addMixIn(ConversionGoalType.class, ConversionGoalTypeMixIn.class)
				.addMixIn(ConversionGoalAdditionalField.class, ConversionGoalAdditionalFieldMixIn.class)
				.addMixIn(AttributionModelType.class, AttributionModelTypeMixIn.class)
				.addMixIn(ConversionGoalCountType.class, ConversionGoalCountTypeMixIn.class)
				.addMixIn(ConversionGoalCategory.class, ConversionGoalCategoryMixIn.class)
				.addMixIn(ConversionGoalRevenueType.class, ConversionGoalRevenueTypeMixIn.class)
				.addMixIn(ConversionGoalStatus.class, ConversionGoalStatusMixIn.class)
				.addMixIn(ConversionGoalTrackingStatus.class, ConversionGoalTrackingStatusMixIn.class)
				.addMixIn(ExpressionOperator.class, ExpressionOperatorMixIn.class)
				.addMixIn(ValueOperator.class, ValueOperatorMixIn.class)
				.addMixIn(ImportAdditionalField.class, ImportAdditionalFieldMixIn.class)
				.addMixIn(ImportEntityType.class, ImportEntityTypeMixIn.class)
				.addMixIn(DeviceType.class, DeviceTypeMixIn.class)
				.addMixIn(AdRecommendationTextTone.class, AdRecommendationTextToneMixIn.class)
				.addMixIn(AdRecommendationVideoType.class, AdRecommendationVideoTypeMixIn.class)
				.addMixIn(AdRecommendationTextField.class, AdRecommendationTextFieldMixIn.class)
				.addMixIn(LocationType.class, LocationTypeMixIn.class)
				.addMixIn(ConversionValueRuleOperator.class, ConversionValueRuleOperatorMixIn.class)
				.addMixIn(ConversionValueRuleStatus.class, ConversionValueRuleStatusMixIn.class)
				.addMixIn(FontTextAssetType.class, FontTextAssetTypeMixIn.class)
				;
	}
}