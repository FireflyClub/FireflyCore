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
import us.hebi.quickbuf.RepeatedInt;

public final class SearchPlayerCsReqOuterClass {
  /**
   * Protobuf type {@code SearchPlayerCsReq}
   */
  public static final class SearchPlayerCsReq extends ProtoMessage<SearchPlayerCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional bool HBKFAMAFCGB = 8;</code>
     */
    private boolean hBKFAMAFCGB;

    /**
     * <pre>
     *  PFKNLFKIJHD
     * </pre>
     *
     * <code>repeated uint32 search_uid_list = 7;</code>
     */
    private final RepeatedInt searchUidList = RepeatedInt.newEmptyInstance();

    private SearchPlayerCsReq() {
    }

    /**
     * @return a new empty instance of {@code SearchPlayerCsReq}
     */
    public static SearchPlayerCsReq newInstance() {
      return new SearchPlayerCsReq();
    }

    /**
     * <code>optional bool HBKFAMAFCGB = 8;</code>
     * @return whether the hBKFAMAFCGB field is set
     */
    public boolean hasHBKFAMAFCGB() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional bool HBKFAMAFCGB = 8;</code>
     * @return this
     */
    public SearchPlayerCsReq clearHBKFAMAFCGB() {
      bitField0_ &= ~0x00000001;
      hBKFAMAFCGB = false;
      return this;
    }

    /**
     * <code>optional bool HBKFAMAFCGB = 8;</code>
     * @return the hBKFAMAFCGB
     */
    public boolean getHBKFAMAFCGB() {
      return hBKFAMAFCGB;
    }

    /**
     * <code>optional bool HBKFAMAFCGB = 8;</code>
     * @param value the hBKFAMAFCGB to set
     * @return this
     */
    public SearchPlayerCsReq setHBKFAMAFCGB(final boolean value) {
      bitField0_ |= 0x00000001;
      hBKFAMAFCGB = value;
      return this;
    }

    /**
     * <pre>
     *  PFKNLFKIJHD
     * </pre>
     *
     * <code>repeated uint32 search_uid_list = 7;</code>
     * @return whether the searchUidList field is set
     */
    public boolean hasSearchUidList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  PFKNLFKIJHD
     * </pre>
     *
     * <code>repeated uint32 search_uid_list = 7;</code>
     * @return this
     */
    public SearchPlayerCsReq clearSearchUidList() {
      bitField0_ &= ~0x00000002;
      searchUidList.clear();
      return this;
    }

    /**
     * <pre>
     *  PFKNLFKIJHD
     * </pre>
     *
     * <code>repeated uint32 search_uid_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSearchUidList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getSearchUidList() {
      return searchUidList;
    }

    /**
     * <pre>
     *  PFKNLFKIJHD
     * </pre>
     *
     * <code>repeated uint32 search_uid_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableSearchUidList() {
      bitField0_ |= 0x00000002;
      return searchUidList;
    }

    /**
     * <pre>
     *  PFKNLFKIJHD
     * </pre>
     *
     * <code>repeated uint32 search_uid_list = 7;</code>
     * @param value the searchUidList to add
     * @return this
     */
    public SearchPlayerCsReq addSearchUidList(final int value) {
      bitField0_ |= 0x00000002;
      searchUidList.add(value);
      return this;
    }

    /**
     * <pre>
     *  PFKNLFKIJHD
     * </pre>
     *
     * <code>repeated uint32 search_uid_list = 7;</code>
     * @param values the searchUidList to add
     * @return this
     */
    public SearchPlayerCsReq addAllSearchUidList(final int... values) {
      bitField0_ |= 0x00000002;
      searchUidList.addAll(values);
      return this;
    }

    @Override
    public SearchPlayerCsReq copyFrom(final SearchPlayerCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        hBKFAMAFCGB = other.hBKFAMAFCGB;
        searchUidList.copyFrom(other.searchUidList);
      }
      return this;
    }

    @Override
    public SearchPlayerCsReq mergeFrom(final SearchPlayerCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasHBKFAMAFCGB()) {
        setHBKFAMAFCGB(other.hBKFAMAFCGB);
      }
      if (other.hasSearchUidList()) {
        getMutableSearchUidList().addAll(other.searchUidList);
      }
      return this;
    }

    @Override
    public SearchPlayerCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      hBKFAMAFCGB = false;
      searchUidList.clear();
      return this;
    }

    @Override
    public SearchPlayerCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      searchUidList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SearchPlayerCsReq)) {
        return false;
      }
      SearchPlayerCsReq other = (SearchPlayerCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasHBKFAMAFCGB() || hBKFAMAFCGB == other.hBKFAMAFCGB)
        && (!hasSearchUidList() || searchUidList.equals(other.searchUidList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeBoolNoTag(hBKFAMAFCGB);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < searchUidList.length(); i++) {
          output.writeRawByte((byte) 56);
          output.writeUInt32NoTag(searchUidList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * searchUidList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(searchUidList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SearchPlayerCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // hBKFAMAFCGB
            hBKFAMAFCGB = input.readBool();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // searchUidList [packed=true]
            input.readPackedUInt32(searchUidList, tag);
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
          case 56: {
            // searchUidList [packed=false]
            tag = input.readRepeatedUInt32(searchUidList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeBool(FieldNames.hBKFAMAFCGB, hBKFAMAFCGB);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.searchUidList, searchUidList);
      }
      output.endObject();
    }

    @Override
    public SearchPlayerCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1469105160: {
            if (input.isAtField(FieldNames.hBKFAMAFCGB)) {
              if (!input.trySkipNullValue()) {
                hBKFAMAFCGB = input.readBool();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 881018438:
          case -85426204: {
            if (input.isAtField(FieldNames.searchUidList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(searchUidList);
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
    public SearchPlayerCsReq clone() {
      return new SearchPlayerCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SearchPlayerCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SearchPlayerCsReq(), data).checkInitialized();
    }

    public static SearchPlayerCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SearchPlayerCsReq(), input).checkInitialized();
    }

    public static SearchPlayerCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SearchPlayerCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SearchPlayerCsReq messages
     */
    public static MessageFactory<SearchPlayerCsReq> getFactory() {
      return SearchPlayerCsReqFactory.INSTANCE;
    }

    private enum SearchPlayerCsReqFactory implements MessageFactory<SearchPlayerCsReq> {
      INSTANCE;

      @Override
      public SearchPlayerCsReq create() {
        return SearchPlayerCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName hBKFAMAFCGB = FieldName.forField("HBKFAMAFCGB");

      static final FieldName searchUidList = FieldName.forField("searchUidList", "search_uid_list");
    }
  }
}
