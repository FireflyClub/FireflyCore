// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.Utf8String;

public final class AnnounceDataOuterClass {
  /**
   * Protobuf type {@code AnnounceData}
   */
  public static final class AnnounceData extends ProtoMessage<AnnounceData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * uint32 JCLHPKIEDIA = 14;
     * </pre>
     *
     * <code>optional int64 end_time = 7;</code>
     */
    private long endTime;

    /**
     * <code>optional int64 begin_time = 11;</code>
     */
    private long beginTime;

    /**
     * <code>optional uint32 nouse_center_system_frequency = 1;</code>
     */
    private int nouseCenterSystemFrequency;

    /**
     * <pre>
     * uint32 ODBEELGCENI = 1;
     * string NFOIIBJPFFG = 8;
     * </pre>
     *
     * <code>optional uint32 config_id = 9;</code>
     */
    private int configId;

    /**
     * <code>optional uint32 banner_frequency = 14;</code>
     */
    private int bannerFrequency;

    /**
     * <pre>
     * string BNGDKIBJHMD = 15;
     * string CENCAKDHHHA = 5;
     * </pre>
     *
     * <code>optional bool is_center_system_last_5_every_minutes = 4;</code>
     */
    private boolean isCenterSystemLast5EveryMinutes;

    /**
     * <code>optional string banner_text = 5;</code>
     */
    private final Utf8String bannerText = Utf8String.newEmptyInstance();

    /**
     * <code>optional string emergency_text = 8;</code>
     */
    private final Utf8String emergencyText = Utf8String.newEmptyInstance();

    /**
     * <pre>
     * ?
     * </pre>
     *
     * <code>optional string nouse_count_down_text = 15;</code>
     */
    private final Utf8String nouseCountDownText = Utf8String.newEmptyInstance();

    private AnnounceData() {
    }

    /**
     * @return a new empty instance of {@code AnnounceData}
     */
    public static AnnounceData newInstance() {
      return new AnnounceData();
    }

    /**
     * <pre>
     * uint32 JCLHPKIEDIA = 14;
     * </pre>
     *
     * <code>optional int64 end_time = 7;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * uint32 JCLHPKIEDIA = 14;
     * </pre>
     *
     * <code>optional int64 end_time = 7;</code>
     * @return this
     */
    public AnnounceData clearEndTime() {
      bitField0_ &= ~0x00000001;
      endTime = 0L;
      return this;
    }

    /**
     * <pre>
     * uint32 JCLHPKIEDIA = 14;
     * </pre>
     *
     * <code>optional int64 end_time = 7;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <pre>
     * uint32 JCLHPKIEDIA = 14;
     * </pre>
     *
     * <code>optional int64 end_time = 7;</code>
     * @param value the endTime to set
     * @return this
     */
    public AnnounceData setEndTime(final long value) {
      bitField0_ |= 0x00000001;
      endTime = value;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return this
     */
    public AnnounceData clearBeginTime() {
      bitField0_ &= ~0x00000002;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @param value the beginTime to set
     * @return this
     */
    public AnnounceData setBeginTime(final long value) {
      bitField0_ |= 0x00000002;
      beginTime = value;
      return this;
    }

    /**
     * <code>optional uint32 nouse_center_system_frequency = 1;</code>
     * @return whether the nouseCenterSystemFrequency field is set
     */
    public boolean hasNouseCenterSystemFrequency() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 nouse_center_system_frequency = 1;</code>
     * @return this
     */
    public AnnounceData clearNouseCenterSystemFrequency() {
      bitField0_ &= ~0x00000004;
      nouseCenterSystemFrequency = 0;
      return this;
    }

    /**
     * <code>optional uint32 nouse_center_system_frequency = 1;</code>
     * @return the nouseCenterSystemFrequency
     */
    public int getNouseCenterSystemFrequency() {
      return nouseCenterSystemFrequency;
    }

    /**
     * <code>optional uint32 nouse_center_system_frequency = 1;</code>
     * @param value the nouseCenterSystemFrequency to set
     * @return this
     */
    public AnnounceData setNouseCenterSystemFrequency(final int value) {
      bitField0_ |= 0x00000004;
      nouseCenterSystemFrequency = value;
      return this;
    }

    /**
     * <pre>
     * uint32 ODBEELGCENI = 1;
     * string NFOIIBJPFFG = 8;
     * </pre>
     *
     * <code>optional uint32 config_id = 9;</code>
     * @return whether the configId field is set
     */
    public boolean hasConfigId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     * uint32 ODBEELGCENI = 1;
     * string NFOIIBJPFFG = 8;
     * </pre>
     *
     * <code>optional uint32 config_id = 9;</code>
     * @return this
     */
    public AnnounceData clearConfigId() {
      bitField0_ &= ~0x00000008;
      configId = 0;
      return this;
    }

    /**
     * <pre>
     * uint32 ODBEELGCENI = 1;
     * string NFOIIBJPFFG = 8;
     * </pre>
     *
     * <code>optional uint32 config_id = 9;</code>
     * @return the configId
     */
    public int getConfigId() {
      return configId;
    }

    /**
     * <pre>
     * uint32 ODBEELGCENI = 1;
     * string NFOIIBJPFFG = 8;
     * </pre>
     *
     * <code>optional uint32 config_id = 9;</code>
     * @param value the configId to set
     * @return this
     */
    public AnnounceData setConfigId(final int value) {
      bitField0_ |= 0x00000008;
      configId = value;
      return this;
    }

    /**
     * <code>optional uint32 banner_frequency = 14;</code>
     * @return whether the bannerFrequency field is set
     */
    public boolean hasBannerFrequency() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 banner_frequency = 14;</code>
     * @return this
     */
    public AnnounceData clearBannerFrequency() {
      bitField0_ &= ~0x00000010;
      bannerFrequency = 0;
      return this;
    }

    /**
     * <code>optional uint32 banner_frequency = 14;</code>
     * @return the bannerFrequency
     */
    public int getBannerFrequency() {
      return bannerFrequency;
    }

    /**
     * <code>optional uint32 banner_frequency = 14;</code>
     * @param value the bannerFrequency to set
     * @return this
     */
    public AnnounceData setBannerFrequency(final int value) {
      bitField0_ |= 0x00000010;
      bannerFrequency = value;
      return this;
    }

    /**
     * <pre>
     * string BNGDKIBJHMD = 15;
     * string CENCAKDHHHA = 5;
     * </pre>
     *
     * <code>optional bool is_center_system_last_5_every_minutes = 4;</code>
     * @return whether the isCenterSystemLast5EveryMinutes field is set
     */
    public boolean hasIsCenterSystemLast5EveryMinutes() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <pre>
     * string BNGDKIBJHMD = 15;
     * string CENCAKDHHHA = 5;
     * </pre>
     *
     * <code>optional bool is_center_system_last_5_every_minutes = 4;</code>
     * @return this
     */
    public AnnounceData clearIsCenterSystemLast5EveryMinutes() {
      bitField0_ &= ~0x00000020;
      isCenterSystemLast5EveryMinutes = false;
      return this;
    }

    /**
     * <pre>
     * string BNGDKIBJHMD = 15;
     * string CENCAKDHHHA = 5;
     * </pre>
     *
     * <code>optional bool is_center_system_last_5_every_minutes = 4;</code>
     * @return the isCenterSystemLast5EveryMinutes
     */
    public boolean getIsCenterSystemLast5EveryMinutes() {
      return isCenterSystemLast5EveryMinutes;
    }

    /**
     * <pre>
     * string BNGDKIBJHMD = 15;
     * string CENCAKDHHHA = 5;
     * </pre>
     *
     * <code>optional bool is_center_system_last_5_every_minutes = 4;</code>
     * @param value the isCenterSystemLast5EveryMinutes to set
     * @return this
     */
    public AnnounceData setIsCenterSystemLast5EveryMinutes(final boolean value) {
      bitField0_ |= 0x00000020;
      isCenterSystemLast5EveryMinutes = value;
      return this;
    }

    /**
     * <code>optional string banner_text = 5;</code>
     * @return whether the bannerText field is set
     */
    public boolean hasBannerText() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional string banner_text = 5;</code>
     * @return this
     */
    public AnnounceData clearBannerText() {
      bitField0_ &= ~0x00000040;
      bannerText.clear();
      return this;
    }

    /**
     * <code>optional string banner_text = 5;</code>
     * @return the bannerText
     */
    public String getBannerText() {
      return bannerText.getString();
    }

    /**
     * <code>optional string banner_text = 5;</code>
     * @return internal {@code Utf8String} representation of bannerText for reading
     */
    public Utf8String getBannerTextBytes() {
      return this.bannerText;
    }

    /**
     * <code>optional string banner_text = 5;</code>
     * @return internal {@code Utf8String} representation of bannerText for modifications
     */
    public Utf8String getMutableBannerTextBytes() {
      bitField0_ |= 0x00000040;
      return this.bannerText;
    }

    /**
     * <code>optional string banner_text = 5;</code>
     * @param value the bannerText to set
     * @return this
     */
    public AnnounceData setBannerText(final CharSequence value) {
      bitField0_ |= 0x00000040;
      bannerText.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string banner_text = 5;</code>
     * @param value the bannerText to set
     * @return this
     */
    public AnnounceData setBannerText(final Utf8String value) {
      bitField0_ |= 0x00000040;
      bannerText.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string emergency_text = 8;</code>
     * @return whether the emergencyText field is set
     */
    public boolean hasEmergencyText() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional string emergency_text = 8;</code>
     * @return this
     */
    public AnnounceData clearEmergencyText() {
      bitField0_ &= ~0x00000080;
      emergencyText.clear();
      return this;
    }

    /**
     * <code>optional string emergency_text = 8;</code>
     * @return the emergencyText
     */
    public String getEmergencyText() {
      return emergencyText.getString();
    }

    /**
     * <code>optional string emergency_text = 8;</code>
     * @return internal {@code Utf8String} representation of emergencyText for reading
     */
    public Utf8String getEmergencyTextBytes() {
      return this.emergencyText;
    }

    /**
     * <code>optional string emergency_text = 8;</code>
     * @return internal {@code Utf8String} representation of emergencyText for modifications
     */
    public Utf8String getMutableEmergencyTextBytes() {
      bitField0_ |= 0x00000080;
      return this.emergencyText;
    }

    /**
     * <code>optional string emergency_text = 8;</code>
     * @param value the emergencyText to set
     * @return this
     */
    public AnnounceData setEmergencyText(final CharSequence value) {
      bitField0_ |= 0x00000080;
      emergencyText.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string emergency_text = 8;</code>
     * @param value the emergencyText to set
     * @return this
     */
    public AnnounceData setEmergencyText(final Utf8String value) {
      bitField0_ |= 0x00000080;
      emergencyText.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     * ?
     * </pre>
     *
     * <code>optional string nouse_count_down_text = 15;</code>
     * @return whether the nouseCountDownText field is set
     */
    public boolean hasNouseCountDownText() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <pre>
     * ?
     * </pre>
     *
     * <code>optional string nouse_count_down_text = 15;</code>
     * @return this
     */
    public AnnounceData clearNouseCountDownText() {
      bitField0_ &= ~0x00000100;
      nouseCountDownText.clear();
      return this;
    }

    /**
     * <pre>
     * ?
     * </pre>
     *
     * <code>optional string nouse_count_down_text = 15;</code>
     * @return the nouseCountDownText
     */
    public String getNouseCountDownText() {
      return nouseCountDownText.getString();
    }

    /**
     * <pre>
     * ?
     * </pre>
     *
     * <code>optional string nouse_count_down_text = 15;</code>
     * @return internal {@code Utf8String} representation of nouseCountDownText for reading
     */
    public Utf8String getNouseCountDownTextBytes() {
      return this.nouseCountDownText;
    }

    /**
     * <pre>
     * ?
     * </pre>
     *
     * <code>optional string nouse_count_down_text = 15;</code>
     * @return internal {@code Utf8String} representation of nouseCountDownText for modifications
     */
    public Utf8String getMutableNouseCountDownTextBytes() {
      bitField0_ |= 0x00000100;
      return this.nouseCountDownText;
    }

    /**
     * <pre>
     * ?
     * </pre>
     *
     * <code>optional string nouse_count_down_text = 15;</code>
     * @param value the nouseCountDownText to set
     * @return this
     */
    public AnnounceData setNouseCountDownText(final CharSequence value) {
      bitField0_ |= 0x00000100;
      nouseCountDownText.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     * ?
     * </pre>
     *
     * <code>optional string nouse_count_down_text = 15;</code>
     * @param value the nouseCountDownText to set
     * @return this
     */
    public AnnounceData setNouseCountDownText(final Utf8String value) {
      bitField0_ |= 0x00000100;
      nouseCountDownText.copyFrom(value);
      return this;
    }

    @Override
    public AnnounceData copyFrom(final AnnounceData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        endTime = other.endTime;
        beginTime = other.beginTime;
        nouseCenterSystemFrequency = other.nouseCenterSystemFrequency;
        configId = other.configId;
        bannerFrequency = other.bannerFrequency;
        isCenterSystemLast5EveryMinutes = other.isCenterSystemLast5EveryMinutes;
        bannerText.copyFrom(other.bannerText);
        emergencyText.copyFrom(other.emergencyText);
        nouseCountDownText.copyFrom(other.nouseCountDownText);
      }
      return this;
    }

    @Override
    public AnnounceData mergeFrom(final AnnounceData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasNouseCenterSystemFrequency()) {
        setNouseCenterSystemFrequency(other.nouseCenterSystemFrequency);
      }
      if (other.hasConfigId()) {
        setConfigId(other.configId);
      }
      if (other.hasBannerFrequency()) {
        setBannerFrequency(other.bannerFrequency);
      }
      if (other.hasIsCenterSystemLast5EveryMinutes()) {
        setIsCenterSystemLast5EveryMinutes(other.isCenterSystemLast5EveryMinutes);
      }
      if (other.hasBannerText()) {
        getMutableBannerTextBytes().copyFrom(other.bannerText);
      }
      if (other.hasEmergencyText()) {
        getMutableEmergencyTextBytes().copyFrom(other.emergencyText);
      }
      if (other.hasNouseCountDownText()) {
        getMutableNouseCountDownTextBytes().copyFrom(other.nouseCountDownText);
      }
      return this;
    }

    @Override
    public AnnounceData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      endTime = 0L;
      beginTime = 0L;
      nouseCenterSystemFrequency = 0;
      configId = 0;
      bannerFrequency = 0;
      isCenterSystemLast5EveryMinutes = false;
      bannerText.clear();
      emergencyText.clear();
      nouseCountDownText.clear();
      return this;
    }

    @Override
    public AnnounceData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      bannerText.clear();
      emergencyText.clear();
      nouseCountDownText.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof AnnounceData)) {
        return false;
      }
      AnnounceData other = (AnnounceData) o;
      return bitField0_ == other.bitField0_
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasNouseCenterSystemFrequency() || nouseCenterSystemFrequency == other.nouseCenterSystemFrequency)
        && (!hasConfigId() || configId == other.configId)
        && (!hasBannerFrequency() || bannerFrequency == other.bannerFrequency)
        && (!hasIsCenterSystemLast5EveryMinutes() || isCenterSystemLast5EveryMinutes == other.isCenterSystemLast5EveryMinutes)
        && (!hasBannerText() || bannerText.equals(other.bannerText))
        && (!hasEmergencyText() || emergencyText.equals(other.emergencyText))
        && (!hasNouseCountDownText() || nouseCountDownText.equals(other.nouseCountDownText));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(nouseCenterSystemFrequency);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(configId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(bannerFrequency);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 32);
        output.writeBoolNoTag(isCenterSystemLast5EveryMinutes);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 42);
        output.writeStringNoTag(bannerText);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 66);
        output.writeStringNoTag(emergencyText);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawByte((byte) 122);
        output.writeStringNoTag(nouseCountDownText);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(nouseCenterSystemFrequency);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(configId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bannerFrequency);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(bannerText);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(emergencyText);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(nouseCountDownText);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public AnnounceData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // nouseCenterSystemFrequency
            nouseCenterSystemFrequency = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // configId
            configId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // bannerFrequency
            bannerFrequency = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // isCenterSystemLast5EveryMinutes
            isCenterSystemLast5EveryMinutes = input.readBool();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // bannerText
            input.readString(bannerText);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // emergencyText
            input.readString(emergencyText);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // nouseCountDownText
            input.readString(nouseCountDownText);
            bitField0_ |= 0x00000100;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.nouseCenterSystemFrequency, nouseCenterSystemFrequency);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.configId, configId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.bannerFrequency, bannerFrequency);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeBool(FieldNames.isCenterSystemLast5EveryMinutes, isCenterSystemLast5EveryMinutes);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeString(FieldNames.bannerText, bannerText);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeString(FieldNames.emergencyText, emergencyText);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeString(FieldNames.nouseCountDownText, nouseCountDownText);
      }
      output.endObject();
    }

    @Override
    public AnnounceData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -799572398:
          case 88421597: {
            if (input.isAtField(FieldNames.nouseCenterSystemFrequency)) {
              if (!input.trySkipNullValue()) {
                nouseCenterSystemFrequency = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -580140035:
          case -804450504: {
            if (input.isAtField(FieldNames.configId)) {
              if (!input.trySkipNullValue()) {
                configId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1075939440:
          case -376047607: {
            if (input.isAtField(FieldNames.bannerFrequency)) {
              if (!input.trySkipNullValue()) {
                bannerFrequency = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -68660299:
          case -630028317: {
            if (input.isAtField(FieldNames.isCenterSystemLast5EveryMinutes)) {
              if (!input.trySkipNullValue()) {
                isCenterSystemLast5EveryMinutes = input.readBool();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1031683463:
          case -1906828704: {
            if (input.isAtField(FieldNames.bannerText)) {
              if (!input.trySkipNullValue()) {
                input.readString(bannerText);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -179220898:
          case -1250292965: {
            if (input.isAtField(FieldNames.emergencyText)) {
              if (!input.trySkipNullValue()) {
                input.readString(emergencyText);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1348746392:
          case 421106017: {
            if (input.isAtField(FieldNames.nouseCountDownText)) {
              if (!input.trySkipNullValue()) {
                input.readString(nouseCountDownText);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public AnnounceData clone() {
      return new AnnounceData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static AnnounceData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new AnnounceData(), data).checkInitialized();
    }

    public static AnnounceData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AnnounceData(), input).checkInitialized();
    }

    public static AnnounceData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AnnounceData(), input).checkInitialized();
    }

    /**
     * @return factory for creating AnnounceData messages
     */
    public static MessageFactory<AnnounceData> getFactory() {
      return AnnounceDataFactory.INSTANCE;
    }

    private enum AnnounceDataFactory implements MessageFactory<AnnounceData> {
      INSTANCE;

      @Override
      public AnnounceData create() {
        return AnnounceData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName nouseCenterSystemFrequency = FieldName.forField("nouseCenterSystemFrequency", "nouse_center_system_frequency");

      static final FieldName configId = FieldName.forField("configId", "config_id");

      static final FieldName bannerFrequency = FieldName.forField("bannerFrequency", "banner_frequency");

      static final FieldName isCenterSystemLast5EveryMinutes = FieldName.forField("isCenterSystemLast5EveryMinutes", "is_center_system_last_5_every_minutes");

      static final FieldName bannerText = FieldName.forField("bannerText", "banner_text");

      static final FieldName emergencyText = FieldName.forField("emergencyText", "emergency_text");

      static final FieldName nouseCountDownText = FieldName.forField("nouseCountDownText", "nouse_count_down_text");
    }
  }
}
