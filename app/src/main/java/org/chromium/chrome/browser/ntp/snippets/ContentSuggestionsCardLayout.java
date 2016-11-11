
// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/ntp_snippets/category_info.h

package org.chromium.chrome.browser.ntp.snippets;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ContentSuggestionsCardLayout {
  @IntDef({
      FULL_CARD, MINIMAL_CARD
  })
  @Retention(RetentionPolicy.SOURCE)
  public @interface ContentSuggestionsCardLayoutEnum {}
  /**
   * Uses all fields.
   */
  public static final int FULL_CARD = 0;
  /**
   * No snippet_text and no thumbnail image.
   */
  public static final int MINIMAL_CARD = 1;
}