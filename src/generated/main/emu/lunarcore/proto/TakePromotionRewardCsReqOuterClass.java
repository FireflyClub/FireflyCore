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

public final class TakePromotionRewardCsReqOuterClass {
  /**
   * Protobuf type {@code TakePromotionRewardCsReq}
   */
  public static final class TakePromotionRewardCsReq extends ProtoMessage<TakePromotionRewardCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 base_avatar_id = 9;</code>
     */
    private int baseAvatarId;

    /**
     * <code>optional uint32 promotion = 13;</code>
     */
    private int promotion;

    private TakePromotionRewardCsReq() {
    }

    /**
     * @return a new empty instance of {@code TakePromotionRewardCsReq}
     */
    public static TakePromotionRewardCsReq newInstance() {
      return new TakePromotionRewardCsReq();
    }

    /**
     * <code>optional uint32 base_avatar_id = 9;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 9;</code>
     * @return this
     */
    public TakePromotionRewardCsReq clearBaseAvatarId() {
      bitField0_ &= ~0x00000001;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 9;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 9;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public TakePromotionRewardCsReq setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 13;</code>
     * @return whether the promotion field is set
     */
    public boolean hasPromotion() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 promotion = 13;</code>
     * @return this
     */
    public TakePromotionRewardCsReq clearPromotion() {
      bitField0_ &= ~0x00000002;
      promotion = 0;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 13;</code>
     * @return the promotion
     */
    public int getPromotion() {
      return promotion;
    }

    /**
     * <code>optional uint32 promotion = 13;</code>
     * @param value the promotion to set
     * @return this
     */
    public TakePromotionRewardCsReq setPromotion(final int value) {
      bitField0_ |= 0x00000002;
      promotion = value;
      return this;
    }

    @Override
    public TakePromotionRewardCsReq copyFrom(final TakePromotionRewardCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        baseAvatarId = other.baseAvatarId;
        promotion = other.promotion;
      }
      return this;
    }

    @Override
    public TakePromotionRewardCsReq mergeFrom(final TakePromotionRewardCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasPromotion()) {
        setPromotion(other.promotion);
      }
      return this;
    }

    @Override
    public TakePromotionRewardCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      baseAvatarId = 0;
      promotion = 0;
      return this;
    }

    @Override
    public TakePromotionRewardCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TakePromotionRewardCsReq)) {
        return false;
      }
      TakePromotionRewardCsReq other = (TakePromotionRewardCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasPromotion() || promotion == other.promotion);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(promotion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(promotion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public TakePromotionRewardCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // promotion
            promotion = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.promotion, promotion);
      }
      output.endObject();
    }

    @Override
    public TakePromotionRewardCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -799212381: {
            if (input.isAtField(FieldNames.promotion)) {
              if (!input.trySkipNullValue()) {
                promotion = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public TakePromotionRewardCsReq clone() {
      return new TakePromotionRewardCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static TakePromotionRewardCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new TakePromotionRewardCsReq(), data).checkInitialized();
    }

    public static TakePromotionRewardCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakePromotionRewardCsReq(), input).checkInitialized();
    }

    public static TakePromotionRewardCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakePromotionRewardCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating TakePromotionRewardCsReq messages
     */
    public static MessageFactory<TakePromotionRewardCsReq> getFactory() {
      return TakePromotionRewardCsReqFactory.INSTANCE;
    }

    private enum TakePromotionRewardCsReqFactory implements MessageFactory<TakePromotionRewardCsReq> {
      INSTANCE;

      @Override
      public TakePromotionRewardCsReq create() {
        return TakePromotionRewardCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName promotion = FieldName.forField("promotion");
    }
  }
}
